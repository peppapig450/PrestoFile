package com.github.peppapig450.prestofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PrestoFile {

    @RequestMapping("/")
    String home() {
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(PrestoFile.class, args);
    }
}