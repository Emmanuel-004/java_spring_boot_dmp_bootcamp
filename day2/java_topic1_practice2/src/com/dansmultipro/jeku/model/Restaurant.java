package com.dansmultipro.jeku.model;

public class Restaurant {
    private String restaurantName;
    private Menu[] restaurantMenu;

    public Restaurant(String restaurantName, Menu[] restaurantMenu){
        this.restaurantName = restaurantName;
        this.restaurantMenu = restaurantMenu;
    }
    public String getRestaurantName() {
        return restaurantName;
    }

    public Menu[] getRestaurantMenu() {
        return restaurantMenu;
    }
}
