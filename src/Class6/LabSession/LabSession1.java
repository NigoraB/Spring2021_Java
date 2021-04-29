package Class6.LabSession;

import java.util.Arrays;

public class LabSession1 {
    public static void main(String[] args) {

        /**
         * Create an array and store 5 int-values.
         * Print the average of numbers in array.
         *
         */
        int[] numArr = {2, 6, 9, 8, 5};
        int together = numArr[0]+numArr[1]+numArr[3]+numArr[4]+numArr[2];
        int average = together/numArr.length;
        System.out.println(average);
        System.out.println("Average of " + Arrays.toString(numArr) + " is : " + average);

        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN"}
         * String nameToSearch = "";
         *
         * Print the position of searched named.
         * if name not found, print "XXXX is not present in the array"
         *
         */
        String[] names = {"john", "happy", "peACe", "jOy", "LEarN"};
        String nameToSearch = "abcd";
        int position = 0;
        if (names[0].equalsIgnoreCase(nameToSearch)) {
            position = 1;
        } else if (names[1].equalsIgnoreCase(nameToSearch)) {
            position = 2;
        } else if (names[2].equalsIgnoreCase(nameToSearch)) {
            position = 3;
        } else if (names[3].equalsIgnoreCase(nameToSearch)) {
            position = 4;
        } else if (names[4].equalsIgnoreCase(nameToSearch)) {
            position = 5;
        }

        if (position > 0) {
            System.out.println(nameToSearch + " is present at position -> " + position);
        } else {
            System.out.println(nameToSearch + " is not present in the array");
        }

        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN"};
         * print the names from array if the name-length is >=5 and contains 'o'
         *
         *
         */





    }
}
