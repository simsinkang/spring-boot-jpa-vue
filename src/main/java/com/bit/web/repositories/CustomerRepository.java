package com.bit.web.repositories;

import com.bit.web.entites.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{

    
}