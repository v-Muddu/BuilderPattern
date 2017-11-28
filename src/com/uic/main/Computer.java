package com.uic.main;

public class Computer {
    private int HDD;
    private int GPU;
    private String model;
    private String maker;

    public int getHDD(){
        return HDD;
    }

    public int getGPU(){
        return GPU;
    }

    public String getModel(){
        return model;
    }

    public String getMaker(){
        return maker;
    }

    public Computer(ComputerBuilder cb){
        this.HDD = cb.HDD;
        this.GPU = cb.GPU;
        this.maker = cb.maker;
        this.model = cb.model;
    }

    public static class ComputerBuilder{
        private int HDD;
        private int GPU;
        private String model;
        private String maker;

        public ComputerBuilder(int _hdd, int _gpu){
            this.HDD = _hdd;
            this.GPU = _gpu;
        }

        public ComputerBuilder setModel(String x){
            this.model = x;
            return this;
        }

        public ComputerBuilder setMaker(String y){
            this.maker = y;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
