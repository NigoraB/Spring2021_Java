package Class3;

public class String_Concept {
    public static void main(String[] args) {

        String cityName = "nEw YoRk";   // 8
        /**
         * start index = 0
         * last index = 7
         * length = 8
         *
         * index is ALWAYS int
         * lastIndex is ALWAYS length-1
         */

        System.out.println("City name: " + cityName);

        // cityname = "nortH caROLinA";    // 14
        /**
         *
         * last index = 13
         * length = 14
         */

        /**
         * To find the length of a String
         * Method: length()
         */
        int cityNameLength = cityName.length();
        System.out.println("Length of " + cityName + " is: " + cityNameLength);

        /**
         * to convert entire string value in lowercase
         * method: toLowerCase()
         *
         * This method is not going to change the original value,
         * It will convert the value in lowercase, return the result to user.
         */
        /*
            converting the value in cityName variable in lowercase
            and, storing the all-lowercase value in new variable (cityNameInLowerCase)
         */
        String cityNameInLowerCase = cityName.toLowerCase();     //String cityName = "nEw YoRk"; "new york"

        System.out.println("City name is lowercase: " + cityNameInLowerCase);
        System.out.println("City name: " + cityName);

        /*
            converting the value in cityName variable in lowercase
            and, replace the original value with the all-lowercase value
         */
        // cityName = cityName.toLowerCase();     //String cityName = "nEw YoRk"; "new york"
        // System.out.println("City name: " + cityName);

        /**
         * to convert entire string value in Uppercase
         * method: toUpperCase()
         *
         * This method is not going to change the original value,
         * It will convert the value in uppercase, return the result to user.
         */
        String cityNameInUpperCase = cityName.toUpperCase();
        System.out.println("City name is uppercase: " + cityNameInUpperCase);
        System.out.println("City name: " + cityName);

        /**
         * For comparison, when we need to verify if two Strings are identical
         * Method: equals()
         * Returns: boolean
         *
         * String abc = "New York";
         * String def = "New York";
         *
         *
         * cityName = nEw YoRk
         * cityNameInLowerCase = new york
         */
        boolean isEqual = cityName.equals(cityNameInLowerCase);
        System.out.println("is " + cityName + " equals to " + cityNameInLowerCase + "?: " + isEqual);

        /**
         * For comparison, when we need to verify if two strings have same value
         * Method: equalsIgnoreCase()
         * Returns: boolean
         *
         * cityName = nEw YoRk
         * cityNameInLowerCase = new york
         */
        boolean isEqualIgnoreCase = cityName.equalsIgnoreCase(cityNameInLowerCase);
        System.out.println("is " + cityName + " equals (ignore case) to " + cityNameInLowerCase + "?: " + isEqualIgnoreCase);

        String abc = "Happy land";      // 10
        String def = "Happy    land";   // 12

        System.out.println(abc.equalsIgnoreCase(def));      // false
        System.out.println(abc.equals(def));                // false


    }
}
