package com.example.education.services;

import com.example.education.components.Converter;
import com.example.education.models.File;
import com.example.education.models.FileRequest;
import com.example.education.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class FileServiceImpl implements FileService {

    private FileRepository fileRepository;
    private Converter converter;

    @Override
    public int create(FileRequest file) throws FileNotFoundException {
        File currFile = converter.requestToFile(file);
        File fileInDb = fileRepository.save(currFile);
        System.out.println(fileInDb.getId());
        return fileInDb.getId();
    }

    @Override
    public File getById(int id) {
        return fileRepository.findById(id).get();
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
