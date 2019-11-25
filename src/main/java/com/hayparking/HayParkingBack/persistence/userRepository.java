package com.hayparking.HayParkingBack.persistence;

import java.util.List;

import com.hayparking.HayParkingBack.entities.User;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * userRepository
 */
public interface userRepository extends MongoRepository<User, String>{

    List<User> findAll();
    User findByEmail(String email);
}