Judul
<br><br>
Deskripsi.

<img src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white"> <img src="https://img.shields.io/badge/-Maven-C71A36?style=flat&logo=apache-maven&logoColor=white"> <img src="https://img.shields.io/badge/-Postman-FF6C37?style=flat&logo=postman&logoColor=white"> <img src="https://img.shields.io/badge/REST%20Assured-6DB33F?style=flat&logo=rest-assured&logoColor=white">

```bash
program-kalkulator/
├── src/
├   ├── main/java/kelompok/a6/maven/
├   ├   └── App.java
├   └── test/java/kelompok/a6/maven/
├       └── AppTest.java
├── target/
├── .gitignore
├── pom.xml
└── README.md
```

| No  | Test Case Name                                                    | Modul Test Name                       |
| :-- | :---------------------------------------------------------------- | :------------------------------------ |
| 1.  | Get user dengan kondisi tidak ada app-id | GetUserWithNoAppId      |
| 2.  | Get user dengan kondisi app-id tidak valid  | GetUserWithAppIdInvalid     |
| 3.  | Get user dengan kondisi  app-id dan id user valid                     | GetUserWithAppIdAndUserIdValid      |
| 4.  | Get user dengan kondisi tidak ada ada user id           | GetUserWithUserIdNotExist       |
| 5.  | Get user dengan kondisi user id tidak valid           | GetUserWithUserIdInvalid           |
| 6.  | Delete user dengan kondisi tidak ada app-id         | DeleteUserWithNoApiId           |
| 7.  | Delete user dengan kondisi app-id tidak valid        | DeleteUserWithAppIdInvalid           |
| 8.  | Delete user dengan kondisi  app-id dan id user valid        | DeleteUserWithAppIdAndUserIdValid |
| 9.  | Delete user dengan kondisi tidak ada ada user id           | DeleteUserWithUserIdNotExist           |
| 10. | Delete user dengan kondisi user id tidak valid                   | DeleteUserWithUserIdInvalid            |
| 11. | Create user dengan field yang valid | testCreateUserWithValidField      |
| 12. | Create user dengan semua field kosong  | testCreateUserWithEmptyField     |
| 13. | Create user menggunakan email yang sudah terdaftar                      | testCreateUserWithExitingEmail      |
| 14. | Create user dengan field firstname kosong          | testCreateUserWithEmptyFirstname       |
| 15. | Create user dengan field lastname kosong          | testCreateUserWithEmptyLastname           |
| 16. | Update user dengan kondisi parameter id user kosong         | testUpdateUserWithEmptyUserIdParameter           |
| 17. | Update user dengan kondisi id user valid dan field Firstname yang panjang     | testUpdateUserWithValidUserIdAndLongFirstname           |
| 18. | Update user dengan kondisi id user valid dan field Lastname yang panjang        | testUpdateUserWithValidUserIdAndLongLastname |
| 19. | Update user dengan kondisi id user valid dan title valid        | testUpdateUserWithValidUserIdAndTitle           |
| 20. |  Update user dengan kondisi id user valid dan gender valid                    | testUpdateUserWithValidUserIdAndGender            |

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
