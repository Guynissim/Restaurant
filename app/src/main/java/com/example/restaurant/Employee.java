package com.example.restaurant;

public abstract class Employee extends Human {

    protected int salary;

    public Employee(int salary, String name) {
        super(name);
        this.salary = salary;
    }

    public abstract String getRole();

    public int getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
