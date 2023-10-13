package org.devajayantha.collection;

import java.util.Collection;

public class main {
    public static void main(String[] args) {
        Collection<String> collection = new java.util.ArrayList<>();

        collection.add("Eko");
        collection.add("Kurniawan");
        collection.add("Khannedy");

        collection.remove("Eko");

        for(var value : collection){
            System.out.println(value);
        }
    }
}
