package com.gmail.ejikemesharon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.gmail.ejikemesharon")
public class TicketInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketInventoryApplication.class, args);
    }
}
