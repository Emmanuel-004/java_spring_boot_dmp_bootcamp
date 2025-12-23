package com.dansmultipro.jeku.service;

import com.dansmultipro.jeku.model.Driver;
import com.dansmultipro.jeku.model.Menu;
import com.dansmultipro.jeku.model.Restaurant;

import java.awt.image.RescaleOp;

public interface FoodService {
    Driver findDriver();
    Restaurant[] findRestaurant();
    int calculateFoodPrice(int price, int foodQty);
    int calculateSendPrice(String from, String to);
}
