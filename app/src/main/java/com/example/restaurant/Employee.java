package com.example.restaurant;

public abstract class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public abstract String getRole();
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
