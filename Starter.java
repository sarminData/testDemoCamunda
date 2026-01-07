package com.example.test_camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    private RuntimeService runtimeService;

    @Override
    public void run(String... args) {
        runtimeService.startProcessInstanceByKey("Process_0v605wo");
        System.out.println("Process started!");
    }
}