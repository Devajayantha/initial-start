package org.devajayantha.generic;

public class Main {
    public static void main(String[] args) {
        MyData<String> data = new MyData<String>();
        data.setData("Hello");
        System.out.println(data.getData());
    }
}
