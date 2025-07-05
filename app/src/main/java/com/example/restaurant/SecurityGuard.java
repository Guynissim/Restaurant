package com.example.restaurant;

public class SecurityGuard extends Employee{
    public SecurityGuard(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String getRole() {
        return "SecurityGuard";
    }
}
