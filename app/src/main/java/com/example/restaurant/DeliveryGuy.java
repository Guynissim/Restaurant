package com.example.restaurant;

public class DeliveryGuy extends Employee{
    public DeliveryGuy(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String getRole() {
        return "DeliveryGuy";
    }
}