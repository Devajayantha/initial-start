package org.devajayantha.models;

import org.devajayantha.HasJob;

public class Manager extends Employee implements HasJob {

    Manager(String name) {
        super(name);
    }

    public void currentProject(String name) {
        System.out.println("Current project is "+ name);
    }

    public void currentSalary(String name) {
        System.out.println("Current salary is "+ name);
    }
}
