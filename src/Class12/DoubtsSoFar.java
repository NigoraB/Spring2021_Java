package Class12;

import Class12.AccessModifier.AccessModifier_Concept;

public class DoubtsSoFar {
    public static void main(String[] args) {

        /**
         * RT Polymorphism
         *
         * How to access/call/execute a static methods?
         *      If calling in any other class, ClassName.methodName()
         *      If calling in the same class, methodName()
         *
         * Enhanced for-loop
         *
         * Discuss 'Student to change course' task
         *
         */

        /**
         * Enhanced for-loop
         */
        int[] numbers = {11, 22, 33, 45, 55};
        /*
            11  numbers
            22
            33
            45
            55
         */
        for (int i = 0 ; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        for (int num : numbers) {
            System.out.println(num);
        }


        AccessModifier_Concept ac = new AccessModifier_Concept();


    }
}
