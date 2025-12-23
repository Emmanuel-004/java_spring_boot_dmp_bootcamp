package com.dansmultipro.jeku;

import com.dansmultipro.jeku.service.FoodService;
import com.dansmultipro.jeku.service.RideService;
import com.dansmultipro.jeku.service.SendService;
import com.dansmultipro.jeku.service.impl.FoodServiceImpl;
import com.dansmultipro.jeku.service.impl.RideServiceImpl;
import com.dansmultipro.jeku.service.impl.SendServiceImpl;
import com.dansmultipro.jeku.view.FoodView;
import com.dansmultipro.jeku.view.MainView;
import com.dansmultipro.jeku.view.RideView;
import com.dansmultipro.jeku.view.SendView;

public class App {
    public static void main(String[] args){
        SendService sendService = new SendServiceImpl();
        RideService rideService = new RideServiceImpl();
        FoodService foodService = new FoodServiceImpl();

        RideView rideView = new RideView(rideService);
        SendView sendView = new SendView(sendService);
        FoodView foodView = new FoodView(foodService);
        new MainView(rideView, sendView, foodView).show();
    }
}
