package org.devajayantha.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main {
    public static void main(String[] args) {
//        implementIterable();
//
//        implementCollection();
//
//        implementList();

        implementImmutableList();
    }

    public static void implementCollection() {
        Collection<String> collection = new java.util.ArrayList<>();

        collection.add("Eko");
        collection.add("Kurniawan");
        collection.add("Khannedy");

        if (collection.contains("Kurniawan")) {
            System.out.println("Kurniawan available");
        }

        for (var value : collection) {
            System.out.println(value);
        }
    }

    public static void implementIterable() {
        Iterable<String> names = List.of();
    }

    public static void implementList() {
        List<String> names = new ArrayList<String>(1);

        names.add("Eko");
        names.add("Kurniawan");

        for (var value : names) {
            System.out.println(value);
        }
    }

    public static void implementImmutableList() {
        Person person = new Person("Eko");

        person.addHobby("Game");
        person.addHobby("Coding");

        List<String> hobbies = person.getHobbies();

        for (var value : hobbies) {
            System.out.println(value);
        }

        // hobbies.add("Bukan Hobby"); // error cause collection type immutable
    }


}