package org.devajayantha.todo.test.view;

import org.devajayantha.todo.repository.TodoListRepository;
import org.devajayantha.todo.repository.TodoListRepositoryImpl;
import org.devajayantha.todo.service.TodoListService;
import org.devajayantha.todo.service.TodoListServiceImpl;
import org.devajayantha.todo.view.TodoListView;

public class TodoListViewTest {
    public  static void main(String[] args) {
        testRemoveTodoList();
    }

    protected static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");

        todoListView.showTodoList();
    }

    protected  static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.addTodoList();

        todoListView.showTodoList();
    }

    protected  static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java Dasar 2");
        todoListService.addTodoList("Belajar Java Dasar 3");

        todoListService.showTodoList();

        todoListView.removeTodoList();

        todoListService.showTodoList();
    }
}
