/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hayparking.HayParkingBack.controllers;

import com.hayparking.HayParkingBack.entities.transport;
import com.hayparking.HayParkingBack.services.transportServices;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author karen
 */

@RestController
@RequestMapping("/transport")
public class transportController {
    
    @Autowired
    transportServices transportServices;
    
    //create
    @PostMapping("/createTransport")
    public ResponseEntity<?> createTransport( @RequestBody transport transport ) {
        try{
            return new ResponseEntity<>(transportServices.createTransport(transport),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
    //r
    
    //update
    @PutMapping()
    public ResponseEntity<?> updateTransport( @RequestBody transport transport ) {
        try{
            return new ResponseEntity<>(transportServices.updateTransport(transport),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
    
    //delete
    @DeleteMapping()
    public ResponseEntity<?> deleteTransport( @RequestBody transport transport ) {
        try{
            return new ResponseEntity<>(transportServices.deleteTransport(transport),HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
    
    
    
}
