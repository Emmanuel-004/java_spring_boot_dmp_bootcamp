package com.dansmultipro.jeku.service.impl;

import com.dansmultipro.jeku.model.Driver;
import com.dansmultipro.jeku.service.RideService;

public class RideServiceImpl implements RideService {
    @Override
    public Driver findDriver() {
        return new Driver("Jamal","B 2933 TGH");
    }

    @Override
    public int calculatePrice(String from, String to) {
        return (from.length() * to.length()) * 1000;
    }
}
