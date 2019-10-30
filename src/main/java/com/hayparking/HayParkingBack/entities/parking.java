package com.hayparking.HayParkingBack.entities;

/**
 * parking
 */
public class parking {

    private String address;
    private String name;
    private String observations;
    private parkingBilling billing;
    private owner owner;

    public parking() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public parkingBilling getBilling() {
        return billing;
    }

    public void setBilling(parkingBilling billing) {
        this.billing = billing;
    }

    public owner getOwner() {
        return owner;
    }

    public void setOwner(owner owner) {
        this.owner = owner;
    }
    
}