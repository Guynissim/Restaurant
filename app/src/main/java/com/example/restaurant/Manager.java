package com.example.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Human{
    private int budget;
    private List<Employee> employees;

    public Manager(int initialBudget,String name) {
        super(name);
        this.budget = initialBudget;
        this.employees = new ArrayList<>();
    }
    @Override
    public String getName() {
        return super.getName();
    }

    public void hireEmployee(Employee e) {
        employees.add(e);
    }

    public void paySalaries() {
        int total = 0;
        for (Employee e : employees) {
            total += e.getSalary();
        }

        if (budget >= total) {
            budget -= total;
        } else {
        }
    }
}

