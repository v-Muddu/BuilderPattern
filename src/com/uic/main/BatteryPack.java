package com.uic.main;

public enum BatteryPack {
    BASE, HIGHEND;

    public static BatteryPack input(int packageUnit){
        switch (packageUnit){
            case(75):
                return BASE;
            case(90):
                return HIGHEND;
        }
        return null;
    }
}
