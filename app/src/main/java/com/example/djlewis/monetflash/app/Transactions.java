package com.example.djlewis.monetflash.app;

import com.orm.SugarRecord;
import com.orm.dsl.Table;
import com.orm.dsl.Unique;

/**
 * Created by root on 5/29/16.
 */

//@Table
public class Transactions extends SugarRecord {
    @Unique
    int trans_id;
    String date;
    String amount;
    String customer;
    int status;


    public Transactions() {

    }

    public Transactions(int trans_id, String date, String amount, String customer, int status) {
        this.trans_id = trans_id;
        this.date = date;
        this.amount = amount;
        this.customer = customer;
        this.status = status;
    }

    public int getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(int trans_id) {
        this.trans_id = trans_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
