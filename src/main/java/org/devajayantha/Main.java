package org.devajayantha;

public class Main {
    public static String[] models = new String[10];
    public static void main(String[] args) {
        testAddTodoList();

        System.out.println("Hello world!");
    }

    /**
     * Show list of todo
     */
    public  static void showTodoList(){
        for (var counter = 0; counter < models.length; counter++) {
            var todo = models[counter];
            var no = counter + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * Test show list
     */
    public  static void testShowTodoList() {
        models[0] = "Buy milk";
        models[1] = "Buy bread";
        models[2] = "Buy eggs";

        showTodoList();
    }

    /**
     * Add new todo into array.
     * @param todo
     */
    public static void addTodoList(String todo) {
        var isFull = true;

        /** condition check if array not full */
        for (var counter = 0; counter < models.length; counter++) {
            if (models[counter] == null) {
                isFull = false;
                break;
            }
        }

        /** Condition if array fulled, resize capacity array */
        if (isFull) {
            var temp = models;
            models = new String[models.length * 2];

            for (var counter = 0; counter < temp.length; counter++) {
                models[counter] = temp[counter];
            }
        }

        /** Add new data into array */
        for (var counter = 0; counter < models.length; counter++) {
            if (models[counter] == null) {
                models[counter] = todo;
                break;
            }
        }
    }

    /**
     * Test add todo list
     */
    public  static  void testAddTodoList() {
        for (var counter = 0; counter < 15; counter++) {
            addTodoList("Buy Stuff " + counter);
        }

        showTodoList();
    }
}