package com.uic.main;

public class Vehicle {
    /**
     * Required Fields
     */
    private String model;
    private String color;
    /**
     * Optional fields
     */
    private int batteryUnit;
    private boolean autoPilot;

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getBatterUnit(){
        return this.batteryUnit;
    }

    public Boolean getAutoPilot(){
        return this.autoPilot;
    }


    @Override
    public String toString(){
        return getModel();
    }


    public Vehicle(VehicleBuilder vehicleBuilder){
        this.model = vehicleBuilder.model;
        this.color = vehicleBuilder.color;
        this.batteryUnit = vehicleBuilder.batteryUnit;
        this.autoPilot = vehicleBuilder.autoPilot;
    }
}
