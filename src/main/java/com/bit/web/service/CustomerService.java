package com.bit.web.service;

import java.util.List;

import com.bit.web.domain.CustomerDTO;
import org.springframework.stereotype.Component;

/**
 * CustomerService
 */

@Component
public interface CustomerService {
    public void addCustomer(CustomerDTO customer);
    public List<CustomerDTO> selectCustomers();
    public List<CustomerDTO> selectCustomersByOption(CustomerDTO option);
    public CustomerDTO selectCustomerById(String customerId);
    public int updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
    public int countAll();
    public CustomerDTO login(CustomerDTO customer);

}