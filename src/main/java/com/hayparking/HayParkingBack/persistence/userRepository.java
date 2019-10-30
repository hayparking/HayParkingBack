package com.hayparking.HayParkingBack.persistence;

import java.util.List;

import com.hayparking.HayParkingBack.entities.user;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * userRepository
 */
public interface userRepository extends MongoRepository<user, String>{

    List<user> findAll();
    user findUser(String email);
}