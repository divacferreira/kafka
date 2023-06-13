package com.edvaldo.str1consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class Str1ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Str1ConsumerApplication.class, args);
    }

}
