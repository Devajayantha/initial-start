package org.devajayantha.todo.test.view;

import org.devajayantha.todo.repository.TodoListRepository;
import org.devajayantha.todo.repository.TodoListRepositoryImpl;
import org.devajayantha.todo.service.TodoListService;
import org.devajayantha.todo.service.TodoListServiceImpl;
import org.devajayantha.todo.view.TodoListView;

public class TodoListViewTest {
    public  static void main(String[] args) {
        testShowTodoList();
    }

    protected static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");

        todoListView.showTodoList();

    }
}
