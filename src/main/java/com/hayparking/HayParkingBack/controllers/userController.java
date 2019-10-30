package com.hayparking.HayParkingBack.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.hayparking.HayParkingBack.entities.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * userController
 */
@RestController
@RequestMapping("/api/v1/math")
public class userController {

    // ================= Get ================= //
    @GetMapping("/")
    public String getRoot() {
        return "<center><h1>Root</h1></center>";
    }

    @GetMapping("/user")
    public ResponseEntity<?> consultAllUsers() {
        try {
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> consultUser(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }

    // ================= Post ================= //

    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> createUser(@RequestBody user user) {
        try {
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }

    // ================= Put ================= //
}