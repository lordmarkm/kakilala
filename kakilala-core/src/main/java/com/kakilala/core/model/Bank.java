package com.kakilala.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "REF_BANK")
public class Bank {

    @Column(name = "BANK_NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
