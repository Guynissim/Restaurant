package com.example.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Manager{
    private int budget;
    private String name;
    private List<Employee> employees;

    public Manager(int initialBudget,String name) {
        this.name = name;
        this.budget = initialBudget;
        this.employees = new ArrayList<>();
    }
    public String getName() {
        return name;
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

