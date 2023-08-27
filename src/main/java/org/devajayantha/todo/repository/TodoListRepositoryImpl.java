package org.devajayantha.todo.repository;

import org.devajayantha.todo.entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository{

    private Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        return data;
    }
}
