package org.devajayantha;

public class Main {
    public static void main(String[] args) {
         /** Disabled temporary
        TodoStarted todoStarted = new TodoStarted();
        todoStarted.viewShowTodoList();
          **/

         Employee employee = new Employee("Devajayantha");
         Manager manager = new Manager("Devajayanthap");

         System.out.println(employee.equals(manager));

         System.out.println("Hello world!");
    }
}
