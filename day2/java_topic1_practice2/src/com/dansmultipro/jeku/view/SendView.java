package com.dansmultipro.jeku.view;

import com.dansmultipro.jeku.model.Driver;
import com.dansmultipro.jeku.service.SendService;

import java.util.Scanner;

public class SendView {

    private final SendService sendService;

    public SendView(SendService sendService){
        this.sendService = sendService;
    }

    void show(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Jeku Send =====");

        String[] packageTypes = sendService.getPackageTypes();
        for(int i = 0; i < packageTypes.length; i++) {
            System.out.println((i + 1) +". "+ packageTypes[i]);
        }
        System.out.println("Pilih jenis barang yang anda kirim : ");
        int selectedPackageType = scanner.nextInt() - 1;

        System.out.println("Masukan berat barang anda (Gram)");
        int itemWeight = scanner.nextInt();

        System.out.println("Masukan alamat lokasi dan tujuan");

        System.out.println("Lokasi Anda : ");
        String from = scanner.next();

        System.out.println("Tujuan anda : ");
        String to = scanner.next();

        Driver driver = sendService.findDriver();
        int price = sendService.calculatePrice(selectedPackageType, itemWeight, from, to);

        System.out.println("=== Detail ====");
        System.out.println("Dari : " + from);
        System.out.println("tujuan : " + to);
        System.out.println("Nama Driver : " + driver.getDriverName());
        System.out.println("Plat Nomor Driver : " + driver.getDriverNumberPlate());
        System.out.println("Jenis Barang : " + packageTypes[selectedPackageType]);
        System.out.println("Harga : " + price);
        System.out.println("=== terima kasih ===");
    }

}
