package org.devajayantha;

public class Main {
    public static String[] models = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        testInput();

        System.out.println("Hello world!");
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();

        return data;
    }

    public static void testInput() {
        var name = input("Name");
        var address = input("Address");

        System.out.println("Hi " + name);
        System.out.println("You live in " + address);
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

    /**
     * Remove todo list
     * @param number
     *
     * @return boolean
     */
    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= models.length) {
            return false;
        } else if (models[number - 1] == null) {
            return false;
        }

        models[number - 1] = null;

        return true;
    }

    /**
     * Test remove todo list
     */
    public static void testRemoveTodoList() {
        addTodoList("Buy milk");
        addTodoList("Buy bread");
        addTodoList("Buy eggs");

        var result = removeTodoList(3);
        System.out.println(result);

        showTodoList();
    }
}