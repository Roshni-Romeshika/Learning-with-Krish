package com.roshni.rentcloud.profileservice.service;

import com.roshni.rentcloud.commons.model.Customer;
import com.roshni.rentcloud.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer fetchById(int profileId) {
        Optional<Customer> customer = customerRepository.findById(profileId);
        if(customer.isPresent()){
            return customer.get();
        }
        return null;
    }

    @Override
    public List<Customer> fetchAll() {
        return customerRepository.findAll();
    }


}
