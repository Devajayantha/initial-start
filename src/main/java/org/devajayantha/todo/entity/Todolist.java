package org.devajayantha.todo.entity;

public class Todolist {
    private String name;

    public Todolist() {
    }

    public Todolist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
