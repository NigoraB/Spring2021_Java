package Class6.LabSession;

import java.util.Arrays;

public class LabSession2 {
    public static void main(String[] args) {

        /**
         * student got grade A, gets full scholarship
         *
         * student got better than grade D, get half scholarship
         *
         * otherwise no scholarship
         *
         * studentGrade is 'A' or 'a'
         *      scholarship = full
         * studentGrade is 'B' or 'C'
         *      scholarship = half
         * for other grades
         *      scholarship = no
         *
         *
         */
        // char studentGrade = 'A';
        String studentGrade = "A";
        String scholarAmount = "";

        if (studentGrade.equalsIgnoreCase("B") || studentGrade.equalsIgnoreCase("C")) {
            scholarAmount = "half";
        } else if (studentGrade.equalsIgnoreCase("A")) {
            scholarAmount = "full";
        } else {
            scholarAmount = "no";
        }

        switch (studentGrade.toUpperCase()) {   // A
            case "A":
                scholarAmount = "full";
                break;
            case "B":
            case "C":
                scholarAmount = "half";
                break;
            default:
                scholarAmount = "no";
        }

        System.out.println("Hey, based on your grade(" + studentGrade + "), you get " + scholarAmount + " scholarship");

        // Hey, based on your grade, you get XXX scholarship


        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN"}
         * String nameToSearch = "abcd";
         *
         * Print the position of searched named.
         * if name not found, print "XXXX is not present in the array"
         *
         * if (names[0] == nameToSearch)
         *      position = 1
         * else if (names[1] == nameToSearch)
         *      position == 2
         * else if (names[2] == nameToSearch)
         *      position == 3
         * else if (names[3] == nameToSearch)
         *      position == 4
         * else if (names[4] == nameToSearch)
         *      position == 5
         * else
         *      name is not present
         *
         */

        /**
         * Create an int-array for 5 values
         * Print the average of numbers present in the array.
         *      total all numbers then divide by the count
         */
//        int[] numbers = {11, 22, 33, 44, 55};
//        double total = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
//        double avg = total/numbers.length;  // double/int -> double
//        System.out.println("Average of " + Arrays.toString(numbers) + " is: " + avg);
//
//
//        // double newAvg = (numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4])/numbers.length;

        /**
         * int[] numbers = {11, 22, 33, 44, 55};
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN"}
         *
         * if the numbers-array has 33 in it,
         *      print the index at which 33 is present in numbers array
         *      And, print the name present at same index in names array.
         *
         */
        int[] numbers = {11, 22, 33, 44, 55};
        String[] names = {"john", "happy", "peACe", "jOy", "LEarN"};

        int num = 33;

        if (num == numbers[0]) {
            System.out.println(num + " is present at index-0");
            System.out.println("Name at index-0 is: " + names[0]);
        } else if (num == numbers[1]) {
            System.out.println(num + " is present at index-1");
            System.out.println("Name at index-0 is: " + names[1]);
        } else if (num == numbers[2]) {
            System.out.println(num + " is present at index-2");
            System.out.println("Name at index-0 is: " + names[2]);
        } else if (num == numbers[3]) {
            System.out.println(num + " is present at index-3");
            System.out.println("Name at index-0 is: " + names[3]);
        } else if (num == numbers[4]) {
            System.out.println(num + " is present at index-4");
            System.out.println("Name at index-0 is: " + names[4]);
        }





    }
}
