package Class6;

public class ConditionalCode_2 {
    public static void main(String[] args) {

        /**
         * Conditional Loops (Conditional Code block)
         *
         * 1. if-else block
         * 2. switch block
         *
         */

        /**
            switch (variable) {
                case value1:
                    // do this
                    // code if variable is equal to value1
                    break;
                case value2:
                    // do this
                    // code if variable is equal to value2
                    break;
                case value3:
                    // do this
                    // code if variable is equal to value3
                    break;
                default:
                    // do this
                    // code if variable is NOT matching any case
             }
         */

        /*
            String name = "happy";
            if (name is happy) --> print "good name"
            if (name is joy) --> print "have fun"
            if (name is learn) --> print "keep learning"
            if name is not from any mentioned above --> print the given name

            if (name.equals("happy)) {
                sout("good name");
            } else if (name.equals("joy)) {
                sout("have fun");
            } else if (name.equals("learn)) {
                sout("keep learning");
            } else {
                sout(name)
            }

            switch(name) {
                case "happy":
                    sout("good name");
                    break;
                case "joy":
                    sout("huve fun");
                    break;
                case "learn":
                    sout("keep learning");
                    break;
                 default:
                    sout(name)
            }



            int creditScore = 710;
            switch(creditScore) {
                case 650:
                    sout("good credit");
                    break;
                case 700:
                    sout("Good credit score: almost there");
                    break;
                case 750:
                    sout("Thank you");
                    break;
                 default:
                    sout(creditScore)
            }


         */


        /**
         *
         * dayName = monday ; print "Day 1"
         * dayName = tuesday ; print "Day 2"
         * ..
         * ..
         * dayName = sunday ; print "Day 7"
         * wrong dayName ; print "Invalid day name"
         *
         */

        String dayName = "tueSdAy";

        switch (dayName.toLowerCase()) {
            case "monday":
                System.out.println("Day 1");
                break;
            case "tuesday":
                System.out.println("Day 2");
                break;
            case "friday":
                System.out.println("Day 5");
                break;
            case "wednesday":
                System.out.println("Day 3");
                break;
            case "sunday":
                System.out.println("Day 7");
                break;
            case "thursday":
                System.out.println("Day 4");
                break;
            case "saturday":
                System.out.println("Day 6");
                break;
            default:
                System.out.println("Invalid day name");
        }

        System.out.println("Outside switch block");

        /**
         * based on month name, print season
         * dec, jan, feb --> winter season
         * mar, apr, may --> summer season
         * jun, jul, aug --> fall season
         * sep, oct, nov --> spring season
         * if invalid month name, print "Invalid month name - ABC"
         */
        String monthName = "";
        switch (monthName.toLowerCase()) {
            case "january":
            case "december":
            case "february":
                System.out.println("Winter Season");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Summer Season");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Fall Season");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Spring Season");
                break;
            default:
                System.out.println("Invalid month name - " + monthName);
        }









































    }
}
