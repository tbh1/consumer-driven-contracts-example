package com.testing.cdc.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by ted on 11/16/15.
 */
@SpringBootApplication
public class ProducerApp {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ProducerApp.class, args);
    }

}

