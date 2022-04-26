package com.example.education.repositories;

import com.example.education.models.File;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends CrudRepository<File, Integer> {

    int create(File file);

    File getById(int id);
}
