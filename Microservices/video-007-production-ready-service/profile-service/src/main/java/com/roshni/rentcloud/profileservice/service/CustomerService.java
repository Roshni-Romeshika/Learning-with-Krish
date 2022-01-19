package com.roshni.rentcloud.profileservice.service;

import com.roshni.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAll();
}
