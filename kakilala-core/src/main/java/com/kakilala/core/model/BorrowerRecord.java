package com.kakilala.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import com.baldy.commons.models.BaseEntity;

@Entity(name = "BORROWER_RECORD")
public class BorrowerRecord extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "EMPLYER_ID", nullable = false)
    private Employer employer;

    @Column(name = "LAST_PAYSLIP")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime lastProvidedPayslip;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public DateTime getLastProvidedPayslip() {
        return lastProvidedPayslip;
    }

    public void setLastProvidedPayslip(DateTime lastProvidedPayslip) {
        this.lastProvidedPayslip = lastProvidedPayslip;
    }

}
