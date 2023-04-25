package org.devajayantha;

public class Main {
    public static String[] models = new String[10];
    public static void main(String[] args) {
        testShowList();

        System.out.println("Hello world!");
    }

    /**
     * Show list of todo
     */
    public  static void showList(){
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
    public  static void testShowList() {
        models[0] = "Buy milk";
        models[1] = "Buy bread";
        models[2] = "Buy eggs";

        showList();
    }
}