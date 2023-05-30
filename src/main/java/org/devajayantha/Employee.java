package org.devajayantha;

public class Employee extends Person{
    Employee(String name) {
        super(name);
    }

    public String toString() {
        return "Employee name is "+ name;
    }
}
