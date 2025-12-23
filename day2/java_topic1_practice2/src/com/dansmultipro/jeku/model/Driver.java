package com.dansmultipro.jeku.model;

public class Driver {
    private String driverName;
    private String driverNumberPlate;

    public Driver(String driverName, String driverNumberPlate){
        this.driverName = driverName;
        this.driverNumberPlate = driverNumberPlate;
    }

    public String getDriverName(){ return driverName; }
    public String getDriverNumberPlate(){ return  driverNumberPlate; }


}
