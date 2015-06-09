package com.kakilala.core.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.joda.time.DateTime;

import com.baldy.commons.models.BaseEntity;

@Entity(name = "LOAN")
public class LoanHeader extends BaseEntity {

    @ManyToOne
    @Column(name = "BORROWER_ID", nullable = false)
    private BorrowerRecord borrower;

    @ManyToOne
    @Column(name = "LENDER_ID")
    private LenderRecord lender;

    @Column(name = "LOAN_AMT", nullable = false)
    private BigDecimal loanAmount;
    
    @Column(name = "INTEREST_RATE", nullable = false)
    private BigDecimal interestRate;

    @Column(name = "INTEREST_AMOUNT", nullable = false)
    private BigDecimal interestAmount;

    @Column(name = "DATE_APPLIED", nullable = false)
    private DateTime dateApplied;

    @Column(name = "DATE_APPROVED")
    private DateTime dateApproved;

    @Column(name = "DATE_APPROVED_MOD")
    private DateTime dateApprovedByModerator;

    @Column(name = "DATE_DUE")
    private DateTime dateDue;

    @Column(name = "DATE_PAID")
    private DateTime datePaid;

    public BorrowerRecord getBorrower() {
        return borrower;
    }

    public void setBorrower(BorrowerRecord borrower) {
        this.borrower = borrower;
    }

    public LenderRecord getLender() {
        return lender;
    }

    public void setLender(LenderRecord lender) {
        this.lender = lender;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(BigDecimal interestAmount) {
        this.interestAmount = interestAmount;
    }

    public DateTime getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(DateTime dateApplied) {
        this.dateApplied = dateApplied;
    }

    public DateTime getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(DateTime dateApproved) {
        this.dateApproved = dateApproved;
    }

    public DateTime getDateApprovedByModerator() {
        return dateApprovedByModerator;
    }

    public void setDateApprovedByModerator(DateTime dateApprovedByModerator) {
        this.dateApprovedByModerator = dateApprovedByModerator;
    }

    public DateTime getDateDue() {
        return dateDue;
    }

    public void setDateDue(DateTime dateDue) {
        this.dateDue = dateDue;
    }

    public DateTime getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(DateTime datePaid) {
        this.datePaid = datePaid;
    }

}
