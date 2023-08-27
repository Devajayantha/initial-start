package org.devajayantha.todo.repository;

import org.devajayantha.todo.entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository{

    private Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        return data;
    }

    @Override
    public void add(Todolist todolist) {
        resizeIfFull();

        /** Add new data into array */
        for (var counter = 0; counter < data.length; counter++) {
            if (data[counter] == null) {
                data[counter] = todolist;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if ((number - 1) >= data.length) {
            return false;
        } else if (data[number - 1] == null) {
            return false;
        }

        data[number - 1] = null;

        return true;
    }

    protected boolean isFull() {
        var isFull = true;

        for (var counter = 0; counter < data.length; counter++) {
            if (data[counter] == null) {
                isFull = false;
                break;
            }
        }

        return isFull;
    }

    protected void resizeIfFull() {
        if (isFull()) {
            var temp = data;
            data = new Todolist[data.length * 2];

            for (var counter = 0; counter < temp.length; counter++) {
                data[counter] = temp[counter];
            }
        }
    }
}
