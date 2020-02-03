package com.myproject.designpatterns.creational.builder.practice;

public class Computer {

   private String hdd;
   private String ram;
   private boolean isBlueTooth;
   private boolean isGraphicCard;

   public Computer(ComputerBuilder builder){
       this.ram=builder.ram;
       this.hdd=builder.hdd;
       this.isBlueTooth=builder.isBlueTooth;
       this.isGraphicCard=builder.isGraphicCard;
   }

    static class ComputerBuilder {
        private String hdd;
        private String ram;
        private boolean isBlueTooth;
        private boolean isGraphicCard;

        public ComputerBuilder(String hdd,String ram){
            this.hdd=hdd;
            this.ram=ram;
        }

        public ComputerBuilder setBlueTooth(boolean blueTooth) {
            isBlueTooth = blueTooth;
            return this;
        }

        public ComputerBuilder setGraphicCard(boolean graphicCard) {
            isGraphicCard = graphicCard;
            return this;
        }


        public Computer build(){
            return new Computer(this);
        }
    }

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public boolean isBlueTooth() {
        return isBlueTooth;
    }

    public boolean isGraphicCard() {
        return isGraphicCard;
    }
}
