package Class6;

public class VariableScope {
    /**
     * Field Variable (Global Variable or CLass Variable)
     *  1. variable which we can access/use anywhere in side the class
     *  2. we create field variable, when we need to share the variable value between two or more methods
     *  Scope: Entire class
     *
     * Local Variable
     *  variables which we create inside a method
     *  Scope: within the method
     *
     * Constant variable:
     * final datatype varName = value;
     *
     *
     *
     */
    static String name = "Happy Peace";
    static int num = 10;
    static int b = 10;
    static char score = 'A';
    final static int routingNumber = 12345678;

    public static void main(String[] args) {
        final String msgSecret = "Initial value of variable - msgSecret";
        int a = 10;
        // int num = 99;

        System.out.println(num);

        final int number;

        System.out.println("Routing number - " + routingNumber);

        // routingNumber = 1234567890;

        num = 11;

        if (a > 5) {
            int b = 22;                     // local variable inside if-loop
            String username = "user1";      // local variable inside if-loop
            System.out.println(a);
            System.out.println(username + " has " + b + " houses");

            b = b * 10;

            a = 10000;

            number = 20;

            System.out.println(b);
        }

        int val = b + 20;

        System.out.println(val);    //      30

        System.out.println(b);      //      10

        System.out.println(score);      // A

        score = 'D';

        System.out.println(score);      // D

        String username = "super user";

        System.out.println(username);

        System.out.println("name - " + name);

        System.out.println(name);
        System.out.println(username);
        System.out.println(a);      // 10000

        System.out.println(score);

    }

    public static void sayHelloToUser() {


        System.out.println("hello - " + name);

        double salary = 110000000.98;

    }


}
