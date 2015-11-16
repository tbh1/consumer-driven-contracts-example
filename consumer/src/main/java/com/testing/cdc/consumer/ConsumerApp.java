package com.testing.cdc.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/**
 * Created by ted on 11/13/15.
 */
@SpringBootApplication
public class ConsumerApp {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ConsumerApp.class, args);
    }

}
