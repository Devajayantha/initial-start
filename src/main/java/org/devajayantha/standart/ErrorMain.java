package org.devajayantha.standart;

import org.devajayantha.standart.error.ValidationException;

public class ErrorMain {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    protected void run() throws ValidationException {
        var number = 11;

        if (number == 10) {
            throw new ValidationException("Number is  10");
        }

        System.out.println("Program is running");
    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Deva",
                    "Jaya",
                    "Ntha"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
