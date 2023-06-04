package com.addtech.springbootmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootmasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmasterApplication.class, args);
    }

    @GetMapping("/")
    Customer getCustomer() {
        return new Customer(100L, "Addisu");
    }

    class Customer {

        private final Long id;
        private final String name;

        Customer(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
