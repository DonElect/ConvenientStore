package com.store.models;

import com.store.implementations.CashierImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Manager extends Staff{

    protected static List<CashierImp> cashierList = new ArrayList<>();
    protected Manager(String firstName, String lastName, int age, String employerID, String email, String address) {
        super(firstName, lastName, age, employerID, email, address);
    }

    protected Manager(){

    }

    public List<CashierImp> getCashierList() {
        return cashierList;
    }

    public void addToCashierList(CashierImp cashier) {
        cashierList.add(cashier);
    }
}
