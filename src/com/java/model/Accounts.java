/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

/**
 *
 * @author pc
 */
public class Accounts {
   int sno;
String account_no;
String account_title;
double min_limit;
double max_limit;
int tran_limit;
double balance;
String accout_type;
String statuss;
double max_tran_limit;
String opening_date;

public Accounts()
{}

    public Accounts(int sno, String account_no, String account_title, double min_limit, double max_limit, int tran_limit, double balance, String accout_type, String statuss, double max_tran_limit, String opening_date) {
        this.sno = sno;
        this.account_no = account_no;
        this.account_title = account_title;
        this.min_limit = min_limit;
        this.max_limit = max_limit;
        this.tran_limit = tran_limit;
        this.balance = balance;
        this.accout_type = accout_type;
        this.statuss = statuss;
        this.max_tran_limit = max_tran_limit;
        this.opening_date = opening_date;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public void setAccount_title(String account_title) {
        this.account_title = account_title;
    }

    public void setMin_limit(double min_limit) {
        this.min_limit = min_limit;
    }

    public void setMax_limit(double max_limit) {
        this.max_limit = max_limit;
    }

    public void setTran_limit(int tran_limit) {
        this.tran_limit = tran_limit;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccout_type(String accout_type) {
        this.accout_type = accout_type;
    }

    public void setStatuss(String statuss) {
        this.statuss = statuss;
    }

    public void setMax_tran_limit(double max_tran_limit) {
        this.max_tran_limit = max_tran_limit;
    }

    public void setOpening_date(String opening_date) {
        this.opening_date = opening_date;
    }

    public int getSno() {
        return sno;
    }

    public String getAccount_no() {
        return account_no;
    }

    public String getAccount_title() {
        return account_title;
    }

    public double getMin_limit() {
        return min_limit;
    }

    public double getMax_limit() {
        return max_limit;
    }

    public int getTran_limit() {
        return tran_limit;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccout_type() {
        return accout_type;
    }

    public String getStatuss() {
        return statuss;
    }

    public double getMax_tran_limit() {
        return max_tran_limit;
    }

    public String getOpening_date() {
        return opening_date;
    }
   

}
