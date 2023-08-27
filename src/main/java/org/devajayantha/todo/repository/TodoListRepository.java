package org.devajayantha.todo.repository;

import org.devajayantha.todo.entity.Todolist;

public interface TodoListRepository {

    Todolist[] getAll();
}
