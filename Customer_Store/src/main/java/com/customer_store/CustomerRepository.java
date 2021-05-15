package com.customer_store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer_store.CustomerEntity;
 
@Repository
public interface CustomerRepository
        extends JpaRepository<CustomerEntity, Long> {
 
}
