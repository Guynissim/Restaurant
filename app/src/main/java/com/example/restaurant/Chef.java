package com.example.restaurant;

public class Chef extends Employee{
    public Chef(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String getRole() {
        return "Chef";
    }
}
