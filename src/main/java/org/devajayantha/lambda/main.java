package org.devajayantha.lambda;

import org.devajayantha.lambda.util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {
        // tryFirstExample();

        //trySecondExample();

        //tryThirdExample();

        tryCollectionExample();
    }

    /** Lambda simple expressions */
    protected static void tryFirstExample() {
        SimpleAction simpleAction = (String name) -> {
            return "Hello " + name;
        };
        System.out.println(simpleAction.action("Devajayantha"));

        SimpleAction simpleAction2 = (String name) -> "Hello 2 " + name;

        System.out.println(simpleAction2.action("Devajayantha"));
    }

    /** lamda expressions with java.util.function. **/
    protected static void trySecondExample() {
        Consumer<String> consumer = s -> System.out.println("Hello " + s);

        consumer.accept("Devajayantha");

        Function<String, Integer> functionLegth = s -> s.length();

        System.out.println(functionLegth.apply("Devajayantha"));

        Predicate<String> predicate = s -> s.length() > 5;

        System.out.println(predicate.test("Devajayantha"));

        Supplier<String> supplier = () -> "Hello";

        System.out.println(supplier.get());
    }

    /** lambda expressions with method references. **/
    protected  static void tryThirdExample() {
        Predicate<String> predicate = StringUtil::isLowerCase;

        System.out.println(predicate.test("devajayantha"));

        Function<String, Integer> functionLegth = String::length;

        System.out.println(functionLegth.apply("Devajayantha"));
    }

    /** lambda expressions with collections. **/
    protected static void tryCollectionExample() {
        List<String> list = List.of("Devajayantha", "Dilshan", "Dilum", "Dilshan");

        list.forEach(name -> System.out.println(name));

        System.out.println("====================================");

        List<String> names = new ArrayList<>();

        names.addAll(list);

        names.removeIf(name -> name.equals("Dilshan"));

        names.forEach(System.out::println);
    }
}
