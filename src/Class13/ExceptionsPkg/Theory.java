package Class13.ExceptionsPkg;

import java.util.Arrays;

public class Theory {
    public static void main(String[] args) {

        /**
         * Exceptions: Unhandled situations
         *
         * Types:
         * Compile Time Exceptions
         * Run Time Exceptions
         *
         * How to handle exceptions:
         *  1. use "throws" keyword (DO NOT USE IT)
         *  2. use try-catch block
         *
         * code which can throw exception, we put that in try block.
         * and the exceptions will be caught in respective catch blocks.
         *  (1 catch block can catch only one exceptions)
         *
         *  Syntax:
         *  try {
         *      // code which
         *      // can throw exceptions
         *  } catch (Exception-1) {
         *      // code to execute if Exception-1 occurs
         *  } catch (Exception-2) {
         *      // code to execute if Exception-2 occurs
         *  } catch (Exception-3) {
         *      // code to execute if Exception-3 occurs
         *  } finally {
         *      // code to run always whether an exceptions occur or not
         *  }
         *
         * --> As soon an exception occurs inside the try-block.
         *  java will come out of thr try-block, and
         *  go inside the catch block which can catch/handle the exception
         *  And, does NOT go back in the try block.
         *
         * finally:
         * It's a block associated with try-catch block.
         * Code in the block will always execute irrespective of exception.
         * --> There can be ONLY ONE finally block with every try-catch block.
         *
         * finally vs final:
         *  final: It's a keyword to create constant variable.
         *
         *
         *
         */

        final int num = 99;

        try {
            int[] numbers = new int[4];

            numbers[0] = 0;

            System.out.println("numbers[0] = " + numbers[0]);

            numbers[3] = 30;

            // to pause the code execution for few milliseconds (1sec = 1000milliseconds)
            Thread.sleep(5000);     // InterruptedExceptions

            numbers[4] = 10;              // ArrayIndexOutOfBoundsException

            System.out.println("numbers array = " + Arrays.toString(numbers));

            System.out.println("numbers[3] = " + numbers[3]);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exceptions occurred");
        } catch (ArrayIndexOutOfBoundsException e) {

            try {

                System.out.println("Incorrect index mentioned for array");

                e.printStackTrace();

                Thread.sleep(10000);

                System.out.println("After 10 seconds - Incorrect index mentioned for array");

            } catch (InterruptedException e1) {
                System.out.println("Interrupted exception within ArrayIndex catch block");
            }

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Incorrect index mentioned for string");
        } finally {
            System.out.println("In the finally block.");
        }

        System.out.println("line of code outside the try-catch block");







    }
}
