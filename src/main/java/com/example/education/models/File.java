package com.example.education.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Map;

@Entity
@Data
public class File {

    @Id
    @javax.persistence.Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    private String name;

    @ElementCollection
    @Column(name = "contents")
    private Map<Double, String> contents;
}
