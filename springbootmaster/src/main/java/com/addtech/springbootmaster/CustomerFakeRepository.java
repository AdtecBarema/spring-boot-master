package com.addtech.springbootmaster;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(new Customer(100L, "Addisu", "password123"),
                new Customer(200L, "Arsema", "123password"));
    }
}
