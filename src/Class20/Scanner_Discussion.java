package Class20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Discussion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] myBills = new double[5];
        // "12.2, 23.4, 54.3"

        try {

            System.out.println("Enter your first name: ");
            String fName = input.next();

            System.out.println("\nEnter your last name: ");
            String lName = input.next();

            System.out.println("\nEnter your age in years (whole number): ");
            int age = input.nextInt();

            System.out.println("\nEntered data\nName: " + fName + " " + lName + ", age = " + age);

        } catch (InputMismatchException e) {
            System.out.println("Invalid data entered. Try again!!");
        }


    }
}
