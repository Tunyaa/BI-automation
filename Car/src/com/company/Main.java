package com.company;

public class Main {

    public static void main(String[] args) {

    }
     static class Car {

        private String brand;
        private int weight;
        private int power;

        public String getBrand(){
            return brand;
        }
        public int getWeight(){
            return weight;
        }
        public int getPower(){
            return power;
        }

        public void setBrand(String brand){
            this.brand = brand;
        }
        public void setWeight(int weight){
            this.weight = weight;
        }
        public void setPower(int power){
            this.power = power;
        }

        public Car(String brand, int weight, int power){

            this.brand=brand;
            this.weight = weight;
            this.power = power;
        }
    }
     static class Lorry extends Car {

        private int capacity;

        public Lorry(String brand, int weight, int power, int capacity) {
            super(brand, weight, power);
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity){
            this.capacity = capacity;
        }
    }
}


