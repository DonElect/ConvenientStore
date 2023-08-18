package com.store;

import com.store.implementations.CashierImp;
import com.store.implementations.Customer;
import com.store.implementations.ManagerImp;
import com.store.services.CashierServices;
import com.store.services.ManagerInterface;

public class Store {

    public static void main(String[] args) {
        //Creating the manager and customer instances and hiring two new cashiers
        ManagerInterface manager = new ManagerImp("Donatus", "Okpala", 29,
                "D55B78", "donatus.okpala@decagon.dev", "Decagon Institute, Ohen");

        CashierServices cashier1 = new CashierImp("Stella", "Louis",
                25, "D0001B2", "stellalouis@gmail.com", "Ikorrodu, Lagos", "Stand 1");
        CashierServices cashier2 = new CashierImp("Marry", "John",
                25, "D0002B2", "maryjohn@gmail.com", "Makurdi, Benue", "Stand 2");

        manager.hire((CashierImp) cashier1);
        manager.hire((CashierImp) cashier2);
        //manager.fire((CashierImp) cashier2);

        Customer customer = new Customer();

        cashier1.addProduct("Mango", 100, 10);
        cashier1.addProduct("Orange", 50, 20);
        cashier1.addProduct("Banana", 500, 5);
        cashier1.addProduct("WaterMelon", 800, 15);
        cashier1.addProduct("Garri", 200, 5);

        customer.addToCart("Mango", 2);
        customer.addToCart("Orange", 5);
        customer.addToCart("Banana", 2);
        customer.addToCart("Garri", 3);

        customer.removeFromCart("Mango", 1);
        customer.removeFromCart("Garri", 2);


        customer.buy();

        cashier2.sell();
        cashier2.dispenseReceipt();
    }
}
