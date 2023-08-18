package com.store.models;

import java.util.Map;

public abstract class Cashier extends Staff{
    protected String cashierStand;
    protected Cashier(String firstName, String lastName, int age, String employerID, String email, String address, String cashierStand) {
        super(firstName, lastName, age, employerID, email, address);
        this.cashierStand = cashierStand;
    }
}
