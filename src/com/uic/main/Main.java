package com.uic.main;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder(5,5).setMaker("Apple").setModel("Mac Book Pro").build();
        System.out.println("Done!");
    }
}
