package com.store.services;

public interface CashierServices {
    void sell();
    void dispenseReceipt();
    void addProduct(String item, int price, int quantity);
}
