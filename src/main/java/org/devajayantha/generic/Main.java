package org.devajayantha.generic;

public class Main {
    public static void main(String[] args) {
        MyData<String> data = new MyData<String>();
        data.setData("Hello");
        System.out.println(data.getData());

        Pair<String, Integer> pair = new Pair<String, Integer>("Hello", 1);

        System.out.println(pair.getFirst());

        System.out.println(count(new Integer[]{1, 2, 3, 4, 5}));

        System.out.println(count(new String[]{"Eko", "Kurniawan", "Khannedy"}));
    }

    public static <T> int count(T[] array){
        int count = 0;
        for(T element : array){
            count++;
        }

        return count;
    }
}
