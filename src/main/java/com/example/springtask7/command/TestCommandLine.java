package com.example.springtask7.command;

import com.example.springtask7.service.ShapeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestCommandLine implements CommandLineRunner {

    private final ShapeService service;
    @Override
    public void run(String... args) throws Exception {
        service.getShapeArea();
    }
}
