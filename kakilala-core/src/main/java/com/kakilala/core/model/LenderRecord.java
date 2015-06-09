package com.kakilala.core.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity(name = "LENDER_RECORD")
public class LenderRecord {

    /**
     * Liquid balance.
     */
    @Column(name = "BAL")
    private BigDecimal balance;

    /**
     * Lender balance currently being used as insurance in loan applications
     * or active loans.
     */
    @Column(name = "BAL_INS")
    private BigDecimal balanceInInsurance;

    /**
     * Lender balance currently being used in active loans.
     */
    @Column(name = "BAL_LOAN")
    private BigDecimal balanceInLoans;

    @Embedded
    private BankAccountDetails bankAccountDetails;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalanceInInsurance() {
        return balanceInInsurance;
    }

    public void setBalanceInInsurance(BigDecimal balanceInInsurance) {
        this.balanceInInsurance = balanceInInsurance;
    }

    public BigDecimal getBalanceInLoans() {
        return balanceInLoans;
    }

    public void setBalanceInLoans(BigDecimal balanceInLoans) {
        this.balanceInLoans = balanceInLoans;
    }

    public BankAccountDetails getBankAccountDetails() {
        return bankAccountDetails;
    }

    public void setBankAccountDetails(BankAccountDetails bankAccountDetails) {
        this.bankAccountDetails = bankAccountDetails;
    }

}
