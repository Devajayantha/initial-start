package org.devajayantha.todo.service;

import org.devajayantha.todo.entity.Todolist;
import org.devajayantha.todo.repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        Todolist[] models  = todoListRepository.getAll();

        System.out.println("TODOLIST");
        for (var counter = 0; counter < models.length; counter++) {
            var todoList = models[counter];
            var no = counter + 1;

            if (todoList != null) {
                System.out.println(no + ". " + todoList.getName());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        Todolist todolist = new Todolist(todo);
        todoListRepository.add(todolist);

        System.out.println("Success add todo list: " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {
        boolean isSuccess = todoListRepository.remove(number);

        if (isSuccess) {
            System.out.println("Success remove todo list: " + number);
        } else {
            System.out.println("Failed remove todo list");
        }
    }
}
