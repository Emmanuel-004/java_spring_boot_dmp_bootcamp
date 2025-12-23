package com.dansmultipro.jeku.view;

import com.dansmultipro.jeku.model.Driver;
import com.dansmultipro.jeku.service.RideService;

import java.util.Scanner;

public class RideView {

    private final RideService rideService;

    public RideView(RideService rideService) {
        this.rideService = rideService;
    }

    void show(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Jeku Ride =====");

        System.out.println("Lokasi Anda : ");
        String from = scanner.nextLine();

        System.out.print("Tujuan anda : ");
        String to = scanner.nextLine();

        Driver driver = rideService.findDriver();
        int price = rideService.calculatePrice(from, to);

        System.out.println("=== Detail ====");
        System.out.println("Dari : " + from);
        System.out.println("tujuan : " + to);
        System.out.println("Nama Driver : " + driver.getDriverName());
        System.out.println("Plat Nomor Driver : " + driver.getDriverNumberPlate());
        System.out.println("Harga : " + price);
        System.out.println("=== terima kasih ===");
    }
}
