package com.hayparking.HayParkingBack.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.hayparking.HayParkingBack.entities.user;
import com.hayparking.HayParkingBack.services.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * userController
 */
@RestController
@RequestMapping("/api/v1/user")
public class userController {

    @Autowired
    userService us;

    // ================= Get ================= //

    @GetMapping("/")
    public ResponseEntity<?> consultAllUsers() {
        try {
            return new ResponseEntity<>(us.findAllUsers(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> consultUser(@PathVariable String email) {
        try {
            return new ResponseEntity<>(us.findUser(email), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }

    // ================= Post ================= //

    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> createUser(@RequestBody user user) {
        try {
            return new ResponseEntity<>(us.createUser(user), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }

    // ================= Put ================= //

    @PutMapping()
    public ResponseEntity<?> updateUser(@RequestBody user user) {
        try {
            return new ResponseEntity<>(us.updateUser(user), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }

    // ================= Delete ================= //

    @DeleteMapping()
    public ResponseEntity<?> deleteUser(@RequestBody user user) {
        try {
            return new ResponseEntity<>(us.deleteUser(user), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
}