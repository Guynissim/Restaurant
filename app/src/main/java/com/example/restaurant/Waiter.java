package com.example.restaurant;

public class Waiter extends Employee{
    public Waiter(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String getRole() {
        return "Waiter";
    }
}
