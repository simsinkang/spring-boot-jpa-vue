package com.bit.web.serviceImpl;

import java.util.List;

import com.bit.web.domain.CustomerDTO;
import com.bit.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Override
    public void addCustomer(CustomerDTO customer) {
        
    }

    @Override
    public List<CustomerDTO> selectCustomers() {
        return null;
    }

    @Override
    public List<CustomerDTO> selectCustomersByOption(CustomerDTO option) {
        return null;
    }

    @Override
    public CustomerDTO selectCustomerById(String customerId) {
        return null;
    }

    @Override
    public int updateCustomer(CustomerDTO customer) {
        int res = 0;
        if(res==1){
            System.out.println("서비스 수정 성공");
        } else {
            System.out.println("서비스 수정 실패");
        }
        return res;
    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {
        
    }

    @Override
    public int countAll() {
        return 0;
    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {
        System.out.println("Controller에서 넘어온 ID : "+customer.getCustomerId());
        System.out.println("Controller에서 넘어온 PW : "+customer.getPassword());
        return null;
        
    }

}