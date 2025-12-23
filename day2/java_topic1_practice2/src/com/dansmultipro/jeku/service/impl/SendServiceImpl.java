package com.dansmultipro.jeku.service.impl;

import com.dansmultipro.jeku.model.Driver;
import com.dansmultipro.jeku.service.SendService;

public class SendServiceImpl implements SendService {

    @Override
    public Driver findDriver() {
        return new Driver("Udin", "B 3284 PWJ");
    }

    @Override
    public int calculatePrice(int item, int itemWeight, String from, String to) {
        int totalPrice;
        if ((item == 2 || item == 4) && itemWeight < 1000){
            totalPrice = (from.length() * to.length() ) * itemWeight;
        } else if ((item == 1 || item == 3) && itemWeight <= 4000){
            totalPrice = (from.length() * to.length()) * itemWeight;
        } else {
            totalPrice = (from.length() * to.length()) * itemWeight + 10000;
        }
        return totalPrice;
    }

    @Override
    public String[] getPackageTypes() {
        return new String[]{"Barang Pecah belah", "Dokumen", "Barang Elektronik", "Obat Obatan"};
    }
}
