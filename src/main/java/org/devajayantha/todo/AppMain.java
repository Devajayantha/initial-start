package org.devajayantha.todo;

import org.devajayantha.todo.repository.TodoListRepository;
import org.devajayantha.todo.repository.TodoListRepositoryImpl;
import org.devajayantha.todo.service.TodoListService;
import org.devajayantha.todo.service.TodoListServiceImpl;
import org.devajayantha.todo.view.TodoListView;

public class AppMain {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}
