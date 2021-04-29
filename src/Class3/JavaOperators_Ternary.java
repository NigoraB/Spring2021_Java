package Class3;

public class JavaOperators_Ternary {
    public static void main(String_Concept[] args) {

        /**
         * Ternary (?:)
         *
         * used in situation where you want to assign value to a variable
         * depending upon condition(s)
         *
         * crScore = 700;
         * boolean isBuyingFirstTime = false;
         *
         * double mortgageRate = crScore > 700, it is 1.1 else 1.5;
         * sout(mortgageRate);  // 1.5
         *
         * Assign mortgageRate = 1.1, if crScore > 700
         * else assign mortgageRate = 1.5
         *
         *
         *
         * double mortgageRate = crScore > 700 || buying-for-first-time, it is 1.1 else 1.5;
         * sout(mortgageRate);  // 1.1
         *
         * double mortgageRate = crScore > 600 && buying-for-first-time, it is 1.1 else 1.5;
         * sout(mortgageRate);  // 1.1
         *
         *
         * Syntax:
         * variableName = condition(s)?valueWhenTrue:valueWhenFalse
         *
         */

        int creditScore = 700;
        boolean isFirstTimeBuyer = true;

        /**
         *  Customer with cs > 700 (1.1) else 1.5
         */
        double mortgageRate = creditScore>700 ? 1.1 : 1.5;

        System.out.println("Credit score -> " + creditScore + ", Mortgage rate: " + mortgageRate);

        double mortgageRate2 = creditScore>700 || isFirstTimeBuyer ? 1.1 : 1.5;

        System.out.println("Credit score -> " + creditScore + ", Mortgage rate: " + mortgageRate2);



        int hour24Value =  19;
        String greetingMsg = hour24Value>12 ? "Good Evening" : "Good day";
        System.out.println("Greeting msg -> " + greetingMsg);

        int val = 19;
        int result = hour24Value>=12 ? val : val++;  // int result = val++;  // assign first and then increment

        System.out.println(result); // 19
        System.out.println(val);    // 19

        // val=19 , hour24Value=19, creditScore=700
        boolean res = hour24Value<10 ? creditScore>650 : val>10;
        /*
            if hour24Value<10 is true
                res = creditScore>650
            else
                res = val>10
         */
        System.out.println("res -> " + res);    // true

        char ini = 'a', lIni = 'H';
        int res1 = ini == lIni ? val : val--;   // int res1 = val--;
        /*
            if ini == lIni is true
                perform true section and put result in variable
            else
                perform false section and put result in variable
         */
















    }
}
