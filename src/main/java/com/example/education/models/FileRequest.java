package com.example.education.models;

import lombok.Data;

import java.io.File;

@Data
public class FileRequest {

    private String name;
    private File file;
}
