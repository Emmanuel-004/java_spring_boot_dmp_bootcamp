package com.dansmultipro.jeku.view;

import java.util.Scanner;

public class MainView {

    private final RideView rideView;
    private final SendView sendView;
    private final FoodView foodView;

    public MainView(RideView rideView, SendView sendView, FoodView foodView) {
        this.rideView = rideView;
        this.sendView = sendView;
        this.foodView = foodView;
    }

    public void show() {
        System.out.println("Selamat Datang di Jeku");
        System.out.println("1. Ride");
        System.out.println("2. Send");
        System.out.println("3. Food");
        System.out.print("Pilih layanan kami : ");

        Scanner scanner = new Scanner(System.in);
        int chosen = scanner.nextInt();
        if (chosen == 1) {
            rideView.show();
        } else if (chosen == 2) {
            sendView.show();
        } else {
            foodView.show();
        }
        show();
    }
}
