package com.kakilala.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.baldy.commons.models.BaseNamedEntity;

@Entity(name = "USER")
public class User extends BaseNamedEntity {

    @Column(name = "FB_ID")
    private String facebookId;

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

}
