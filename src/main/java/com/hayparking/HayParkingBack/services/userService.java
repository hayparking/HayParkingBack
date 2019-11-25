package com.hayparking.HayParkingBack.services;

import com.hayparking.HayParkingBack.entities.User;
import com.hayparking.HayParkingBack.persistence.userRepository;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * userService
 */
@Service
public class userService {
	
    @Autowired
    userRepository repo;

    public List<User> findAllUsers() {
        return repo.findAll();
    }

    public User findUser(String email){
        return repo.findByEmail(email);
    }

    public User createUser(User user) {
        return repo.save(user);
    }

    public User updateUser(User user) {
        return null;
    }

    public User deleteUser(User user) {
        return null;
    }


}