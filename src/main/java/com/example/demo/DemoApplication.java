package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}


@RestController("/")
class controller {
    @Autowired
    Service service;

    @GetMapping
    String sayHello() {
        service.sayHello("Hello World");
        return "";
    }
}

@org.springframework.stereotype.Service
class Service {
    void sayHello(String string) {
        System.out.println(string);
    }
}
