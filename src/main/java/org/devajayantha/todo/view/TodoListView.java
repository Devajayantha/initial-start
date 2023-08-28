package org.devajayantha.todo.view;

import org.devajayantha.todo.service.TodoListService;
import org.devajayantha.todo.util.InputUtil;

import static org.devajayantha.standart.TodoStarted.viewAddTodoList;

public class TodoListView {
    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList(){
        while (true) {
            todoListService.showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("x. Exit");

            var input = InputUtil.input("Choose : ");

            if (input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                removeTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Wrong input");
            }
        }
    }

    public void addTodoList(){
        System.out.println("ADD TODO");

        var todo = InputUtil.input("Todo (x if cancel) : ");

        if (!todo.equals("x")) {
            todoListService.addTodoList(todo);
        }
    }

    public  void removeTodoList(){}
}
