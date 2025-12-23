package com.dansmultipro.jeku.service.impl;

import com.dansmultipro.jeku.model.Driver;
import com.dansmultipro.jeku.model.Menu;
import com.dansmultipro.jeku.model.Restaurant;
import com.dansmultipro.jeku.service.FoodService;

public class FoodServiceImpl implements FoodService {
    @Override
    public Driver findDriver() {
        return new Driver("Rudi","B 4792 UWH");
    }

    @Override
    public Restaurant[] findRestaurant() {
        Menu nasiAyam = new Menu("Nasi Ayam Pecel", 22000);
        Menu nasiLele = new Menu("Nasi Lele Pecel", 18000);
        Menu nasiBebek = new Menu("Nasi Bebek pecel", 24000);

        Restaurant pecelUena = new Restaurant("Tenda Pecel Uena", new Menu[]{nasiAyam, nasiLele, nasiBebek});

        Menu mieGoreng = new Menu("Mie Goreng", 15000);
        Menu nasiGoreng = new Menu("nasi Goreng", 17000);
        Menu kwetiauGoreng = new Menu("Kwetiau Goreng", 15000);

        Restaurant masGareng = new Restaurant("Nasi Goreng Mas Gareng", new Menu[]{mieGoreng, nasiGoreng, kwetiauGoreng});

        return new Restaurant[]{pecelUena, masGareng};
    }

    @Override
    public int calculateFoodPrice(int price, int foodQty) {
        return (price * foodQty);
    }

    @Override
    public int calculateSendPrice(String from, String to) {
        return (from.length() * to.length()) * 100;
    }

}
