package org.devajayantha;

public class Employee extends Person{
    Employee(String name) {
        super(name);
    }

    public String toString() {
        return "Employee name is "+ name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            return this.name.equals(employee.name);
        }

        return false;
    }
}
