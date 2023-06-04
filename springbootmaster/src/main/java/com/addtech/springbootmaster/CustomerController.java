package com.addtech.springbootmaster;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    @GetMapping("/")
    Customer getCustomer() {
        return new Customer(100L, "Addisu");
    }
}
