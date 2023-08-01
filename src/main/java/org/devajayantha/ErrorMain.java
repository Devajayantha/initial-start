package org.devajayantha;

import org.devajayantha.error.ValidationException;

public class ErrorMain {
    public static void main(String[] args) {
        ErrorMain errorMain = new ErrorMain();

        try {
            errorMain.run();
        } catch (ValidationException exception) {
            System.out.println("Error : " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("Error : " + exception.getMessage());
        }

    }

    protected void run() throws ValidationException {
        var number = 11;

        if (number == 10) {
            throw new ValidationException("Number is  10");
        }

        System.out.println("Program is running");
    }
}
