package com.dansmultipro.jeku.service;

import com.dansmultipro.jeku.model.Driver;

public interface RideService {
    Driver findDriver();
    int calculatePrice(String from, String to);
}
