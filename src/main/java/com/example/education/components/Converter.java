package com.example.education.components;

import com.example.education.models.File;
import com.example.education.models.FileRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;

@Component
public class Converter {

    private FileRead fileRead;

    public File requestToFile(FileRequest fileRequest) throws FileNotFoundException {
        File file = new File();
        file.setName(fileRequest.getFile().getName());
        file.setContents(fileRead.readFile(fileRequest.getFile()));
        return file;
    }

    @Autowired
    public void setFileRead(FileRead fileRead) {
        this.fileRead = fileRead;
    }
}
