package com.store.implementations;

import com.store.models.Manager;
import com.store.services.ManagerInterface;

public class ManagerImp extends Manager implements ManagerInterface {
    public ManagerImp(String firstName, String lastName, int age, String employerID, String email, String address) {
        super(firstName, lastName, age, employerID, email, address);
    }

    public ManagerImp(){

    }

    @Override
    public void hire(CashierImp cashier) {
        cashier.setHired(true);
        new ManagerImp().addToCashierList(cashier);
        System.out.println("New cashier employed.");
    }

    @Override
    public void fire(CashierImp cashier) {
        if(new ManagerImp().getCashierList().contains(cashier)){
            cashier.setHired(false);
            new ManagerImp().getCashierList().remove(cashier);
            System.out.println("Welcome to Roban Store Miss "+cashier.getFirstName()+ ". \nMy name is "+getFirstName()+" i am the manager.");
        }
        else
            System.out.println("No Cashier with such name.");
    }
}
