/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hayparking.HayParkingBack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.hayparking.HayParkingBack.services.parkingServices;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.hayparking.HayParkingBack.entities.parking;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author karen
 */
@RestController
@RequestMapping("/parking")
public class parkingController {
    @Autowired
    parkingServices parkingServices;
    
    //create
    @PostMapping("/createParking")
    public ResponseEntity<?> createParking( @RequestBody parking parking ) {
        try{
            return new ResponseEntity<>(parkingServices.createParking(parking),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
    //r
    
    //update
    @PutMapping()
    public ResponseEntity<?> updateParking( @RequestBody parking parking ) {
        try{
            return new ResponseEntity<>(parkingServices.updateParking(parking),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
    
    //delete
    @DeleteMapping()
    public ResponseEntity<?> deleteParking( @RequestBody parking parking ) {
        try{
            return new ResponseEntity<>(parkingServices.deleteParking(parking),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
    
    
}
