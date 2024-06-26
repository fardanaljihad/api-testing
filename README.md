# Automation API Testing using Rest Assured

## Overview Project

Proyek ini berisi kumpulan skrip pengujian yang dirancang khusus untuk menguji API dari situs web DummyAPI, yaitu Program User Controller. Proyek ini menggunakan teknologi-teknologi seperti Maven, Rest Assured, dan JUnit untuk memastikan fungsi API yang tepat dan respons yang diharapkan dari setiap endpoint.

<img src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white"> <img src="https://img.shields.io/badge/-Maven-C71A36?style=flat&logo=apache-maven&logoColor=white"> <img src="https://img.shields.io/badge/-Postman-FF6C37?style=flat&logo=postman&logoColor=white"> <img src="https://img.shields.io/badge/REST%20Assured-6DB33F?style=flat&logo=rest-assured&logoColor=white">

## Project Structure

Berikut ini adalah struktur direktori untuk api testing menggunakan Maven dan Rest Assured.

```bash
api-testing/
├── src/
├   ├── main/java/com/a6/apitesting/maven/
├   ├   └── App.java
├   └── test/
├       ├── java/com/a6/apitesting/maven/
├       └── resources/
├── target/
├── .gitignore
├── pom.xml
└── README.md
```

- **src/ :** Direktori tempat source code proyek disimpan. Terbagi menjadi dua sub-direktori:

  - **main/java/com/a6/apitesting/maven/ :** Source code proyek disimpan di direktori ini, tetapi ini tidak digunakan dalam proyek ini.
  - **test/java/com/a6/apitesting/maven/ :** Direktori ini berisi source code (unit test) untuk memastikan fungsi api sesuai harapan.

- **target/ :** Direktori ini dihasilkan oleh Maven saat proyek dikompilasi. Berisi file-file hasil kompilasi seperti file bytecode, file JAR, dan hasil pembuatan lainnya.

- **.gitignore :** File ini berisi daftar file dan direktori yang diabaikan oleh Git saat proses pelacakan perubahan (version control), berguna untuk menyimpan file-file sementara atau hasil kompilasi.

- **pom.xml :** Ini adalah file konfigurasi utama untuk proyek Maven. Di dalamnya, ditentukan dependensi proyek, pengaturan pembuatan, konfigurasi plugin, dan informasi proyek lainnya seperti nama, versi, dan deskripsi.

## Prerequisites
1. Install Java (JDK)
2. Install Maven
3. Install IDE (example: Visual Studio Code) 

## How to run Program
com.a6.apitesting.maven;
1. Clone Project
```shell
git clone https://github.com/fardanaljihad/api-testing.git
```
2. Open Project on IDE
3. Open Terminal on IDE
4. Install Dependencies
```shell
mvn install
```
5. Build Program
```shell
mvn package
```

## List Test Case

| No  | Test Case Name                                                            | Modul Test Name                               |
| :-- | :------------------------------------------------------------------------ | :-------------------------------------------- |
| 1.  | Get user dengan kondisi tidak ada app-id                                  | GetUserWithNoAppId                            |
| 2.  | Get user dengan kondisi app-id tidak valid                                | GetUserWithAppIdInvalid                       |
| 3.  | Get user dengan kondisi app-id dan id user valid                          | GetUserWithAppIdAndUserIdValid                |
| 4.  | Get user dengan kondisi tidak ada ada user id                             | GetUserWithUserIdNotExist                     |
| 5.  | Get user dengan kondisi user id tidak valid                               | GetUserWithUserIdInvalid                      |
| 6.  | Delete user dengan kondisi tidak ada app-id                               | DeleteUserWithNoApiId                         |
| 7.  | Delete user dengan kondisi app-id tidak valid                             | DeleteUserWithAppIdInvalid                    |
| 8.  | Delete user dengan kondisi app-id dan id user valid                       | DeleteUserWithAppIdAndUserIdValid             |
| 9.  | Delete user dengan kondisi tidak ada ada user id                          | DeleteUserWithUserIdNotExist                  |
| 10. | Delete user dengan kondisi user id tidak valid                            | DeleteUserWithUserIdInvalid                   |
| 11. | Create user dengan field yang valid                                       | testCreateUserWithValidField                  |
| 12. | Create user dengan semua field kosong                                     | testCreateUserWithEmptyField                  |
| 13. | Create user menggunakan email yang sudah terdaftar                        | testCreateUserWithExitingEmail                |
| 14. | Create user dengan field firstname kosong                                 | testCreateUserWithEmptyFirstname              |
| 15. | Create user dengan field lastname kosong                                  | testCreateUserWithEmptyLastname               |
| 16. | Update user dengan kondisi parameter id user kosong                       | testUpdateUserWithEmptyUserIdParameter        |
| 17. | Update user dengan kondisi id user valid dan field Firstname yang panjang | testUpdateUserWithValidUserIdAndLongFirstname |
| 18. | Update user dengan kondisi id user valid dan field Lastname yang panjang  | testUpdateUserWithValidUserIdAndLongLastname  |
| 19. | Update user dengan kondisi id user valid dan title valid                  | testUpdateUserWithValidUserIdAndTitle         |
| 20. | Update user dengan kondisi id user valid dan gender valid                 | testUpdateUserWithValidUserIdAndGender        |

## How to run test cases

1. Open the terminal by pressing `Ctrl + Shift + ~`.
2. Command to run a specific test `case: mvn test -Dtest=[Test Class name]#[Test case name]`.
3. Command to run all test cases: `mvn test`.
4. Command for generating project report: `mvn site`.
5. Command to generate a test report: `mvn surefire-report:report`.

## Author

- Fardan Al Jihad
- Muhaman Naufal Al Ghani
- Yayang Setia Budi
