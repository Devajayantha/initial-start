package org.devajayantha.todo.test.service;

import org.devajayantha.todo.repository.TodoListRepository;
import org.devajayantha.todo.repository.TodoListRepositoryImpl;
import org.devajayantha.todo.service.TodoListService;
import org.devajayantha.todo.service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testShowTodoList();
    }

    protected  static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }
}
