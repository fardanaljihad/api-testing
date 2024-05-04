package com.a6.apitesting.maven.utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class TestUtilities {

    public static String loadJsonFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
