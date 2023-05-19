package org.devajayantha;

public class Main {
    public static void main(String[] args) {
         /** Disabled temporary
        TodoStarted todoStarted = new TodoStarted();
        todoStarted.viewShowTodoList();
          **/

         Employee employee = new Employee("Deva");
         employee.sayHello("agus");
         System.out.println(employee.name);
         Person person = (Employee) employee;
         person.sayHello("agus 2");

         System.out.println("Hello world!");
    }
}
