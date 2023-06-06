package com.addtech.springbootmaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/customers")
@Deprecated
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomer() {
        return customerService.getCustomers();
    }

    @PostMapping("/")
    public void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST Request, new customer is created: "+customer);
    }

    @PutMapping("/")
    public void updateNewCustomer(@RequestBody Customer customer){
        System.out.println("PUT Request, update customer:  "+customer);
    }
    @DeleteMapping(path = "{customerID}")
    public void deleteCustomer(@PathVariable("customerID") Long id){
        System.out.println("Delete Request, customer with id:"+id );
    }
}
