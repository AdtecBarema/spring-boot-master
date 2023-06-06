package com.addtech.springbootmaster;

import com.addtech.springbootmaster.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/customers")
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers() {

        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping
    public void createNewCustomer(@RequestBody @Valid  Customer customer){
        System.out.println("POST Request, new customer is created: "+customer);
    }

    @PutMapping
    public void updateNewCustomer(@RequestBody Customer customer){
        System.out.println("PUT Request, update customer:  "+customer);
    }

    @DeleteMapping(path = "{customerID}")
    public void deleteCustomer(@PathVariable("customerID") Long id){
        System.out.println("Delete Request, customer with id:"+id );
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id) {
       throw new ApiRequestException("ApiRequestException for customer"+id);
    }

}
