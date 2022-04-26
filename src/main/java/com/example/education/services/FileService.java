package com.example.education.services;

import com.example.education.models.File;
import com.example.education.models.FileRequest;

public interface FileService {

    int create(FileRequest file);

    File getById(int id);
}
