package org.devajayantha;

import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
//        handleData(20);

//        handleSumNumber(10);
//
//        System.out.println(handleReverseString(new String("hello world")));

//        var result1 = basicRomanNumerals("XLVI");
//        System.out.println(result1);

        System.out.println(String.valueOf(1));
//        var result = twoSum(new int[]{8, 1, 2, 3, 4, 5, 7});
//        System.out.println(result);
    }

    public static void handleData(int number) {
        for (int i = 1; i <= number; i++) {
            if ((i % 5 == 0) && (i % 10 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }

            System.out.println("Buzz");
        }
    }

    public static String handleReverseString(String title) {
        StringBuilder b = new StringBuilder();

        for (int i= title.length() - 1; i >= 0; i--) {
            b.append(title.charAt(i));
        }

        //dlrow olleh
        return b.toString();
    }

    protected static int basicRomanNumerals(String str) {
        HashMap<String, Integer> numerals = new HashMap<>();
        numerals.put("M", 1000);
        numerals.put("D", 500);
        numerals.put("C", 100);
        numerals.put("X", 10);
        numerals.put("L", 50);
        numerals.put("V", 5);
        numerals.put("I", 1);
        // reversing the string makes the parsing easier
        char[] reversed = new StringBuilder(str).reverse().toString().toCharArray();
        int result = 0;
        int prevValue = 0;
        for (char cr : reversed) {
            int thisValue = numerals.get(Character.toString(cr));
            if (thisValue > prevValue) {
                result += thisValue;
            } else {
                result -= thisValue;
            }
            prevValue = thisValue;
        }
        return result;
    }

    protected static String twoSum(int[] arr) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == arr[0]) {
                    if (output.length() > 0) {
                        output.append(" ");
                    }
                    output.append(arr[i]).append(",").append(arr[j]);
                }
            }
        }
        return output.length() == 0 ? "-1" : output.toString();
    }
}
