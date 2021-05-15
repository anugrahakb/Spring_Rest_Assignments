package com.storedetails;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.storedetails.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}
