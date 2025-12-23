package com.dansmultipro.jeku.service;

import com.dansmultipro.jeku.model.Driver;

public interface SendService {
    Driver findDriver();
    int calculatePrice(int item, int itemWeight, String from, String to);
    String[] getPackageTypes();
}
