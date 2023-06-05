package com.addtech.springbootmaster;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepo {
    List<Customer> getCustomers();
}
