package com.alexandevcwa.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CafetitoMsConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CafetitoMsConfigServerApplication.class, args);
    }

}
