package com.example.education.models;

import lombok.Data;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import java.util.Map;

@Data
@Entity
public class File {

    @Id
    @GeneratedValue
    private String id;

    private File file;
    private Map<Integer, Integer> contents;
}
