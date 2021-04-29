package Class2;

public class JavaOperators_Comparison {
    public static void main(String[] args) {

        /**
         * Comparison (>, >=, <, <=, ==, !=)
         *
         * Result of any comparison operation is always boolean
         *
         */
        int com1 = 5;
        int com2 = 7;

        boolean com1GrCom2 = com1 > com2;       // greater than
        System.out.println(com1 + " > " + com2 + " = " + com1GrCom2);

        boolean com1GrEqCom2 = com1 >= com2;    // greater than or equal to
        System.out.println(com1 + " >= " + com2 + " = " + com1GrEqCom2);

        boolean com1LeCom2 = com1 < com2;       // less than
        System.out.println(com1 + " < " + com2 + " = " + com1LeCom2);

        boolean com1LeEqCom2 = com1 <= com2;    // Less than or equal to
        System.out.println(com1 + " <= " + com2 + " = " + com1LeEqCom2);

        boolean com1EqCom2 = com1 == com2;      // is com1 equal to com2
        System.out.println(com1 + " == " + com2 + " = " + com1EqCom2);

        boolean com1NtEqCom2 = com1 != com2;      // is com1 NOT equal to com2
        System.out.println(com1 + " != " + com2 + " = " + com1NtEqCom2);

        boolean res = com1++ == --com2;     // com1-> 5, com2->7
        System.out.println("res: " + res);
        System.out.println(com1);
        System.out.println(com2);


    }
}
