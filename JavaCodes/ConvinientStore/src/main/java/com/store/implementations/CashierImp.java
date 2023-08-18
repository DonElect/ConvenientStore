package com.store.implementations;

import com.store.models.Cashier;
import com.store.services.CashierServices;

import java.util.Map;

public class CashierImp extends Cashier implements CashierServices {
    private boolean isHired;
    public CashierImp(String firstName, String lastName, int age, String employerID, String email, String address, String cashierStand) {
        super(firstName, lastName, age, employerID, email, address, cashierStand);
    }

    public boolean isHired() {
        return isHired;
    }

    public void setHired(boolean hired) {
        isHired = hired;
    }

    @Override
    public void sell() {
        if(isHired()) {
            System.out.println("The following item in your store are been bought.");
        }else System.out.println("You are no longer a staff here. And cannot sell");
    }

    @Override
    public void dispenseReceipt() {
        if(isHired()) {
            int sum = 0;
            System.out.println("**************************************");
            System.out.println("Purchase receipt");
            System.out.println("Products                  Price(₦\u200E)              Quantity");
            for (Map.Entry<String, Integer> items : new Customer().getCart().entrySet()) {
                System.out.println(items.getKey() + "         :             " + items.getValue() + "        :         " + new Customer().getCartQuantity().get(items.getKey()));
                sum += items.getValue() * (new Customer().getCartQuantity().get(items.getKey()));
            }
            System.out.println("Total price: " + sum + "\nThank you for patronizing us, have a great day!");
            System.out.println();
        }else System.out.println("You are no longer a staff here. And so cannot dispense receipt");
    }

    @Override
    public void addProduct(String item, int price, int quantity) {
        if(isHired()) {
            new Products().getProducts().put(item, price);
            new Products().getProductQuantity().put(item, quantity);
            System.out.println(item + " has been added to the store.");
            System.out.println();
        }else System.out.println("You are no longer a staff here. And so cannot add products to store");
    }
}
