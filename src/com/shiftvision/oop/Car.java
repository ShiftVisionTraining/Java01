package com.shiftvision.oop;

import com.shiftvision.oop.Calculator;

public class Car {
    private String brand;
    private int numberOfWheel;
    private String color;
    private float speed;

//    public Car(){
//        System.out.println("Car class getting init...");
//    }


    public void setBrand(String brand){
        if(brand.length() < 3){
            throw new RuntimeException("Brand can not be less then 3 char");
        } else {
            this.brand = brand;
        }
    }
    public String getBrand(){
        return this.brand;
    }


    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        if(numberOfWheel < 1){
            throw new RuntimeException("You can not have less then 1 wheel");
        } else {
            this.numberOfWheel = numberOfWheel;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        if(speed < 0){
            throw new RuntimeException("You can not have less then 0 as speed");
        } else {
            this.speed = speed;
        }
    }

    public String drive(){
        return "Car{" +
                "brand='" + brand + '\'' +
                ", numberOfWheel=" + numberOfWheel +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    public void print(){
        System.out.println("Brang: " + this.brand);
    }


}
