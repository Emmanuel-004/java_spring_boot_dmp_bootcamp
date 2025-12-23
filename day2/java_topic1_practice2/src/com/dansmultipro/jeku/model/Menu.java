package com.dansmultipro.jeku.model;

public class Menu {
    String menuName;
    int menuPrice;

    public Menu(String menuName, int menuPrice) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
    }

    public String getMenuName(){
        return  menuName;
    }

    public int getMenuPrice(){
        return  menuPrice;
    }
}
