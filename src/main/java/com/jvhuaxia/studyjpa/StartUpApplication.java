package com.jvhuaxia.studyjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jvhuaxia.studyjpa")
public class StartUpApplication {

  public static void main(String[] args) {
    SpringApplication.run(StartUpApplication.class, args);
  }
}
