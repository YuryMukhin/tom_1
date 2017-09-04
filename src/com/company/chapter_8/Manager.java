package com.company.chapter_8;

/**
 * Created by ymukhin on 9/4/2017.
 */
public class Manager extends Employee {
    private int salary;

    public Manager() {
        super();
    }

    public Manager(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
