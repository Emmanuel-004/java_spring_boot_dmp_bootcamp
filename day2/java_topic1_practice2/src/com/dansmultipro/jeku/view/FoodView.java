package com.dansmultipro.jeku.view;

import com.dansmultipro.jeku.model.Driver;
import com.dansmultipro.jeku.model.Menu;
import com.dansmultipro.jeku.model.Restaurant;
import com.dansmultipro.jeku.service.FoodService;

import java.util.Scanner;

public class FoodView {
    private final FoodService foodService;

    public FoodView(FoodService foodService){
        this.foodService = foodService;
    }

    void show(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Jeku Food =====");

        Restaurant[] restaurants = foodService.findRestaurant();
        for(int i = 0; i < restaurants.length; i++) {
            System.out.println((i + 1) +". "+ restaurants[i].getRestaurantName());
        }
        System.out.println("Pilih restaurant : ");
        int selectedResto = scanner.nextInt() - 1;

        Restaurant restaurant = restaurants[selectedResto];
        Menu[] menus = restaurant.getRestaurantMenu();
        for(int i = 0; i < menus.length; i++){
            System.out.println((i + 1) + ". "+menus[i].getMenuName() + " @"+ menus[i].getMenuPrice());
        }
        System.out.println("Pilih menu : ");
        int selectedMenu = scanner.nextInt() - 1;
        Menu chosenMenu = menus[selectedMenu];

        System.out.println("Masukan Jumlah : ");
        int foodQty = scanner.nextInt();

        System.out.println("Masukan alamat anda : ");
        String to = scanner.next();

        Driver driver = foodService.findDriver();
        int foodPrice = foodService.calculateFoodPrice(chosenMenu.getMenuPrice(), foodQty);
        int sendPrice = foodService.calculateSendPrice(restaurant.getRestaurantName(), to);
        int totalPrice = foodPrice + sendPrice;

        System.out.println("=== Detail ====");
        System.out.println("Dari : " + restaurant.getRestaurantName());
        System.out.println("Tujuan : " + to);
        System.out.println("Nama Makanan : " + chosenMenu.getMenuName());
        System.out.println("jumlah Makanan : " + foodQty);
        System.out.println("Harga Makanan : " + foodPrice);
        System.out.println("Ongkos Kirim : " + sendPrice);
        System.out.println("total bayar : " + totalPrice);
        System.out.println("Nama Driver : " + driver.getDriverName());
        System.out.println("Plat Nomor Driver : " + driver.getDriverNumberPlate());
        System.out.println("=== terima kasih ===");
    }

}
