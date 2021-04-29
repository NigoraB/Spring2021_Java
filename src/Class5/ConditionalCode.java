package Class5;

public class ConditionalCode {
    public static void main(String[] args) {

        /**
         * Conditional Loops (Conditional Code)
         *
         * 1. if-else block
         * 2. switch block
         *
         */

        /**
         * If you find oat milk at store and it is not expiring in 1 week
         *      buy 2 of those
         * else if almond milk is present
         *      buy 1 of it
         * else
         *      call me.
         */

        /**
         * If you find oat milk at store and it is not expiring in 1 week
         *      buy 2 of those
         */
        /**
            if (condition(s)) {
                 // if block
            }
        */
        int num1 = 10;
        if (num1 >= 5 && num1 <=15) {
            System.out.println("num1 is greater than 10");
        }
        System.out.println("Outside the if block");

        /**
            if (condition(s)) {
                // if
                // block
            } else {
                // else
                // block
            }
        */
        num1 = 7;
        if (num1 > 10) {
            System.out.println("num1 is greater than 10");
        } else {
            System.out.println("num1 is less or equal to 10");
        }

        /**
            if (condition(s)) {
                // if
                // block
            } else if (condition(s)) {
                // else-if
                // block
            } else {
                // else
                // block
            }
         */

        String days = "     weekdays";       // weekdays , weekend
        boolean anyMeeting = false;     // true, false
        String clothes = "";

        /**
         * days = weekend ; clothes = casual
         * days = weekdays and meeting = false ; clothes = formals
         * days = weekdays and meeting = true ; clothes = suit
         */
        if (days.trim().equalsIgnoreCase("weekend")) {
            clothes = "casual";
        } else if (days.trim().equalsIgnoreCase("weekdays") && !anyMeeting) {
            clothes = "formal";
        } else if (days.trim().equalsIgnoreCase("weekdays") && anyMeeting) {
            clothes = "suit";
        } else {
            System.out.println("Invalid data entered");
            clothes = "Retry with valid data";
        }
        System.out.println("Preferred clothes: " + clothes);


        // Preferred clothes: suit

        /*
                    anyMeeting == true    is same as    anyMeeting
                true == true    (anyMeeting = true)
                true

                false == true   (anyMeeting == false)
                false

         */

        /*
                    anyMeeting == false     is same as   !anyMeeting
                --> for what value of anyMeeting the comparison result will be true
                false == false  (anyMeeting = false)    !anyMeeting
                true

                true == false   (anyMeeting = true)     !anyMeeting
                false

         */









    }
}
