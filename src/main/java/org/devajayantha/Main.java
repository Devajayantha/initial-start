package org.devajayantha;

public class Main {
    public static void main(String[] args) {
         /** Disabled temporary
        TodoStarted todoStarted = new TodoStarted();
        todoStarted.viewShowTodoList();
          **/

         Manager manager = new Manager();
         System.out.println(manager.getStatusParent());

        System.out.println("Hello world!");
    }
}
