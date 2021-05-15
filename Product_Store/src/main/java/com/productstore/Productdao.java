package com.productstore;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.productstore.Product;

@Repository
public interface Productdao extends MongoRepository<Product, Integer> {

}