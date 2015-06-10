package com.kakilala.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.baldy.commons.models.BaseEntity;

@Entity(name = "REF_BANK")
public class Bank extends BaseEntity {

    @Column(name = "BANK_NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
