package org.example;

public class AC {

    private int temperature = 25;

    public void on() {
        System.out.println("turn on the ac");
    }

    public void off() {
        System.out.println("turn off the ac");
    }

    public void displayTemperature() {
        System.out.println("The Ac Temperature: " + temperature);
    }

    public void reduceTemperature() {
        temperature--;
    }
}
