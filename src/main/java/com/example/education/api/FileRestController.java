package com.example.education.api;

import lombok.Data;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/file")
@Data
public class FileRestController {

    private final JdbcOperations jdbcOperations;
}
