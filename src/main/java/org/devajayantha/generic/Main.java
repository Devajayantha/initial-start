package org.devajayantha.generic;

public class Main {
    public static void main(String[] args) {
        MyData<String> data = new MyData<String>();
        data.setData("Hello");
        System.out.println(data.getData());

        Pair<String, Integer> pair = new Pair<String, Integer>("Hello", 1);

        System.out.println(pair.getFirst());
    }
}
