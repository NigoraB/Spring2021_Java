package Class17;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {

        /**
         * Set: It's datatype which can store multiple values, BIT NO duplicates.
         *
         * HashSet never maintains the order of insertion.
         * Hashing is technique to use memory space efficiently.
         *
         *
         * Syntax to create Set/HashSet:
         *
         * HashSet<datatypeClass> myHashSet = new HashSet<>();
         * OR
         * Set<datatypeClass> mySet = new HashSet<>();
         *
         * List vs Set:
         * 1. List can contain duplicate data/values whereas Set cannot contain duplicate data/values.
         * 2. List maintains the order of insertion whereas Set does not maintain the order of insertion
         *
         */
        Set<Double> interestRates = new HashSet<>();

        /**
         * method: size()
         * to find length/size of Set
         * return type: int
         */
        int interestRatesSize = interestRates.size();
        System.out.println("Interest rates size: " + interestRatesSize);    // 0
        System.out.println("interest rates --> " + interestRates);          // []


        /**
         * method: add()
         * To add data in Set
         */
        interestRates.add(1.1);
        interestRates.add(2.2);
        interestRates.add(12.2);
        interestRates.add(1.11);
        interestRates.add(2.0);
        interestRates.add(12.2);
        interestRates.add(13.1);
        interestRates.add(22.0);
        interestRates.add(1.2);

        System.out.println("\nInterest rates size: " + interestRates.size());     // 8
        System.out.println("interest rates --> " + interestRates);              // []

        /**
         * method: remove
         * to remove the data from Set
         */
        /**
         * using the data
         * if the given data is found, java will remove the occurrence of it, and returns true
         * else returns false
         */
        boolean is1_1Removed = interestRates.remove(1.1);
        System.out.println("\nis 1.1 removed successfully? " + is1_1Removed);

        boolean is11_1Removed = interestRates.remove(11.1);
        System.out.println("is 11.1 removed successfully? " + is11_1Removed);

        System.out.println("\nInterest rates size: " + interestRates.size());     // 7
        System.out.println("interest rates --> " + interestRates);              // []

        /**
         * method: contains()
         * if the given value found in the set
         *      returns true
         * else
         *      returns false
         *
         * return type: boolean
         */
        boolean is1_1Contains = interestRates.contains(1.1);
        System.out.println("\nis contains 1.1 : " + is1_1Contains);   // false

        boolean is2_2Contains = interestRates.contains(2.2);
        System.out.println("is contains 2.2 : " + is2_2Contains);

        System.out.println("\nInterest rates size: " + interestRates.size());     // 7
        System.out.println("interest rates --> " + interestRates);              // []

        /**
         * method: isEmpty()
         * if set is empty, returns true
         * else returns false
         * return type: boolean
         */
        boolean isSetEmpty = interestRates.isEmpty();
        System.out.println("is interestRates empty? :  " + isSetEmpty);
        System.out.println("\nInterest rates size: " + interestRates.size());     // 7
        System.out.println("interest rates --> " + interestRates);

        /**
         * method: clear()
         * return type: void
         *
         * to clear (or empty) the hashSet/set
         */
        System.out.println("Clearing the Set");
        interestRates.clear();

        System.out.println("\nis interestRates empty? :  " + interestRates.isEmpty());
        System.out.println("\nInterest rates size: " + interestRates.size());     // 7
        System.out.println("interest rates --> " + interestRates);
    }
}
