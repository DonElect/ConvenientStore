package com.store.services;

import com.store.implementations.CashierImp;

public interface ManagerInterface {
    void hire(CashierImp cashier);
    void fire(CashierImp cashier);
}
