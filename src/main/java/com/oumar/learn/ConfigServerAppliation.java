package com.oumar.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerAppliation {

    public static void main(String args[]) {
        SpringApplication.run(ConfigServerAppliation.class, args);
    }
}
