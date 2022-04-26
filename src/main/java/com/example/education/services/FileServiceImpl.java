package com.example.education.services;

import com.example.education.components.Converter;
import com.example.education.models.File;
import com.example.education.models.FileRequest;
import com.example.education.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {

    private FileRepository fileRepository;
    private Converter converter;

    @Override
    public int create(FileRequest file) {
        File currFile = converter.requestToFile(file);
        return fileRepository.create(currFile);
    }

    @Override
    public File getById(int id) {
        return fileRepository.getById(id);
    }

    @Autowired
    public void setFileRepository(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Autowired
    public void setConverter(Converter converter) {
        this.converter = converter;
    }
}
