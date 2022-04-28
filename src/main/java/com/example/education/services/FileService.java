package com.example.education.services;

import com.example.education.models.File;
import com.example.education.models.FileRequest;

import java.io.FileNotFoundException;

public interface FileService {

    int create(FileRequest file) throws FileNotFoundException;

    File getById(int id);
}
