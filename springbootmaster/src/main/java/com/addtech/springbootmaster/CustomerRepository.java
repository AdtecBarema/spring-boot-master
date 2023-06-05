package com.addtech.springbootmaster;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Primary
public class CustomerRepository  implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
         //TODO connect to real DB
        return Collections.singletonList(new Customer(1L, "TODO. Implement real DB"));
    }
}