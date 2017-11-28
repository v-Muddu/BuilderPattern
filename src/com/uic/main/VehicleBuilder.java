package com.uic.main;

public class VehicleBuilder {

    public String model;
    public String color;
    public int batteryUnit;
    public boolean autoPilot;

    public VehicleBuilder(String _model, String _color){
        this.model = _model;
        this.color = _color;
    }

    public void setBatteryUnit(int _batterUnit){
        this.batteryUnit = _batterUnit;
    }

    public void setAutoPilot(boolean _autoPilot){
        this.autoPilot = _autoPilot;
    }

    public Vehicle build(){
        return new Vehicle(this);
    }
}
