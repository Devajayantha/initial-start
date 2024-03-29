package org.devajayantha.standart;

import org.devajayantha.standart.enums.Level;
import org.devajayantha.standart.models.Student;
import org.devajayantha.standart.records.LoginRequest;

public class Main {
    public static void main(String[] args) {
         /** Disabled temporary
        TodoStarted todoStarted = new TodoStarted();
        todoStarted.viewShowTodoList();
          **/

//         Employee employee = new Employee("Devajayantha");
//         Manager manager = new Manager("Devajayanthap");
//
//         System.out.println(employee.equals(manager));
//
//         System.out.println(employee.hashCode());
//
//         System.out.println("Hello world!");

        LoginRequest loginRequest = new LoginRequest("devajayantha", "123456");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());

        Level levelName = Level.valueOf("REGULAR");
        System.out.println(levelName);

        Student student = new Student("Deva", Level.REGULAR.toString());

        System.out.println(student.type);
    }
}
