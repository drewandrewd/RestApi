package com.example.education.components;

import lombok.Data;
import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

@Component
@Data
public class FileRead {

    private int counter;
    private double chapters;

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
                content = countContent(line, content);
                builder.append(line);
            } else {
                builder.append(" ")
                        .append(line);
            }
        }
        return map;
    }

    public Double countContent(String line, double content) {
        String[] lines = line.split("");
        int chapterCounter = 0;
        double result = 0;
        for (String curr : lines) {
            if (!curr.equals("#")) {
                break;
            }
            chapterCounter++;
        }
        double chapter = 1;
        for (int i = 0; i < chapterCounter - 1; i++) {
            chapter *= 0.1;
        }
        int difference = counter - chapterCounter;
        if (chapterCounter == 1) {
            result = Math.round(1 + content);
        } else if (difference > 0) {
            result = DoubleRounder.round(content + chapter, chapterCounter - 1);
        } else {
            result = DoubleRounder.round(content + chapter, chapterCounter);
        }
        counter = chapterCounter;
        return result;
    }
}
