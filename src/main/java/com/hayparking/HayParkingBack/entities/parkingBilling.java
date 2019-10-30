package com.hayparking.HayParkingBack.entities;

/**
 * parkingBilling
 */
public class parkingBilling {

    private String tid;
    private String id;
    private String commercialRegister;
    private String businessName;
    private boolean billingElectronic;
    private String email;

    public parkingBilling() {
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommercialRegister() {
        return commercialRegister;
    }

    public void setCommercialRegister(String commercialRegister) {
        this.commercialRegister = commercialRegister;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public boolean isBillingElectronic() {
        return billingElectronic;
    }

    public void setBillingElectronic(boolean billingElectronic) {
        this.billingElectronic = billingElectronic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}