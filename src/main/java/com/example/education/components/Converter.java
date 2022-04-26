package com.example.education.components;

import com.example.education.models.File;
import com.example.education.models.FileRequest;
import org.springframework.stereotype.Component;

@Component
public class Converter {

    public File requestToFile(FileRequest fileRequest) {
        File file = new File();
        file.setName(fileRequest.getName());

        return file;
    }

}
