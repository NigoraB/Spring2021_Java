package Class9;

public class ClassObject_and_Method_Concept {
    public static void main(String[] args) {

        String name = "happy";
        String nameUppercase = name.toUpperCase();

        /**
         * Method: Lines of code to perform a specific task
         *
         * Benefit: no code repetition
         *
         * Method name should reflect the purpose of method
         *
         * Syntax:
         * <access-modifier> [static] <datatype-of-returnedValue|void> <methodName> (blank | <datatype> <varName1>, <datatype> <varName2>) {
         *      // code
         * }
         */

        add2IntNumbers(10, 11);

        add2IntNumbers(5, 5);

//        System.out.println("Result --> " + result);
//
//        int abc = result * 10;
//
//        System.out.println("abc --> " + abc);

        String reverse1 = reverseString("happy holidays");
        System.out.println("reverse1 --> " + reverse1);

        System.out.println("Reverse 2 --> " + reverseString(" learn"));


        System.out.println(divide2IntNumbers(20, 10));      // 2

        System.out.println(divide2IntNumbers(10, 3));       // 3.333

        System.out.println(divide2IntNumbers(0, 10));       // 0

        System.out.println(divide2IntNumbers(10, 0));       // 0

        System.out.println(greetUserByFirstName("Happy"));

        String greeting = greetUserByFirstName("Happy");
        System.out.println(greeting);

        greetUserByFirstName1("Happy");                 // Hello Happy

        greetUserByFirstName1("");                      // Hello User

        greetUserByFirstName1("       ");               // Hello User

        greetUserByFirstName1("hAppY");                 // Hello Happy

        greetUserByFirstName1("           HaPpY");      // Hello Happy

        greetUserByFirstName1("Happy Peace love");           // Hello Happy


    }

    /**
     * Write a method to greet user by the firstname
     *
     * name:            greetUserByFirstName
     * input:           1 (String)
     * return type:     String
     */
    public static String greetUserByFirstName (String fName) {
        String greeting = "";
        if (fName.trim().length() == 0) {
            greeting = "Hello User";
        } else {
            if (fName.split("\\s+").length > 1) {
                String[] names = fName.split("\\s+");
                fName = names[0];
            }
            fName = fName.toLowerCase().trim();
            fName = fName.substring(0, 1).toUpperCase() + fName.substring(1);
            greeting = "Hello " + fName;
        }
        return greeting;
    }

    public static void greetUserByFirstName1 (String fName) {
        System.out.println("Hello " + fName);
    }

    public static void add2IntNumbers(int num1, int num2) {
        int res = num1 + num2;
        System.out.println("res --> " + res);
    }

    /**
     * Reverse any given string
     * Name: reverseString
     * Input: 1 (String)
     * Return: reversed string (String)
     */
    public static String reverseString (String myString) {
        String reverseSentence3 = "";
        String[] myStringArray = myString.split("");
        for (int i=1 ; i <= myStringArray.length ; i++) {
            reverseSentence3 = reverseSentence3 + myStringArray[myStringArray.length-i];
        }
        return reverseSentence3;
    }

    /**
     * Write a method to divide 2 numbers
     */
    public static double divide2IntNumbers(int num1, double num2) {
        double result = 0.0;
        if (num2 != 0) {
            result = num1 / num2;
        }
        return result;
    }









}
