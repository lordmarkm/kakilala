package com.kakilala.core.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.baldy.commons.models.BaseNamedEntity;
import com.baldy.commons.models.proper.Address;

@Entity(name = "EMPLOYER")
public class Employer extends BaseNamedEntity {

    @Embedded
    private Address address;
    
    @Column(name = "CONTACT_NUM", nullable = false)
    private String contactNumber;

    @Column(name = "EMAIL")
    private String email;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
