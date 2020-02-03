package com.myproject.designpatterns.creational.builder;

public class Computer {

    private String ram;
    private String hdd;

    private boolean isBlueToothEnabled;
    private boolean isGraphicsCard;

    public Computer(ComputerBuilder computerBuilder) {
        this.ram = computerBuilder.ram;
        this.hdd = computerBuilder.hdd;
        this.isBlueToothEnabled = computerBuilder.isBlueToothEnabled;
        this.isGraphicsCard = computerBuilder.isGraphicsCard;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public boolean isBlueToothEnabled() {
        return isBlueToothEnabled;
    }

    public boolean isGraphicsCard() {
        return isGraphicsCard;
    }

    public static class ComputerBuilder {
        private String ram;
        private String hdd;

        private boolean isBlueToothEnabled;
        private boolean isGraphicsCard;

        public ComputerBuilder(String ram,String hdd) {
            this.ram = ram;
            this.hdd = hdd;
        }

        public ComputerBuilder setBlueToothEnabled(boolean blueToothEnabled) {
            isBlueToothEnabled = blueToothEnabled;
            return this;
        }

        public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
            isGraphicsCard = graphicsCard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
