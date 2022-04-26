package com.example.education.api;

import com.example.education.models.File;
import com.example.education.models.FileRequest;
import com.example.education.services.FileServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/file")
@Data
public class FileRestController {

    private FileServiceImpl fileService;

    @GetMapping(value = "/{id}")
    public File findById(@PathVariable("id") int id) {
        return fileService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public int create(@RequestBody FileRequest file) {
        return fileService.create(file);
    }


    @Autowired
    public void setFileService(FileServiceImpl fileService) {
        this.fileService = fileService;
    }
}
