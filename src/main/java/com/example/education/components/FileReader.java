package com.example.education.components;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileRead {

    public Map<Double, String> readFile(File file) throws FileNotFoundException {
        Map<Double, String> map = new TreeMap<>();
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        StringBuilder builder = new StringBuilder();
        double content = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.charAt(0) == '#') {
                if (builder.length() != 0) {
                    map.put(content, builder.toString());
                    builder.setLength(0);
                }
                content = countContent(line);
                builder.append(line);
            } else {
                builder.append(" ")
                        .append(line);
            }
        }
        return map;
    }

    public Double countContent(String line) {

    }
}
