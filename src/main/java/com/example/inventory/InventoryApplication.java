package com.example.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);

        System.out.println("<===================================>");
        System.out.println("==== Your application is running ====");
        System.out.println("<===================================>");

    }

}
