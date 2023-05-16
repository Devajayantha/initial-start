package org.devajayantha;

public class Main {
    public static void main(String[] args) {
         /** Disabled temporary
        TodoStarted todoStarted = new TodoStarted();
        todoStarted.viewShowTodoList();
          **/
         Person person = new Person("Devajayantha");
         person.sayHello("budi");

         person = new Employee("Deva");
         person.sayHello("budi 2");

         person = new Manager("Deva 2");
         person.sayHello("budi 3");

        System.out.println("Hello world!");
    }
}
