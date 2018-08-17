package com.momu.momubot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class MomuBotApplication {

  public static void main(String[] args) {
    SpringApplication.run(MomuBotApplication.class, args);
  }
}
