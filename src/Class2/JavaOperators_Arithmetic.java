package Class2;

public class JavaOperators_Arithmetic {
    public static void main(String[] args) {

        /**
         *
         * Arithmetic (+, -, *, /, %, ++, --)
         */

        /**
         * Arithmetic
         * +
         * -
         * *
         * /
         * %    Modulus Operator
         * ++   increment (pre-increment/post-increment)
         * --   decrement (pre-decrement/post-decrement)
         */
        // int num1 = 10, num2= 20, num3;
        int num1 = 23;
        int num2 = 20;
        int num3 = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + num3);
                        //  23 + 20 = 43

        int num4 = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + num4);
                        //  23 - 20 = 3

        int num5 = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + num5);
                        //  23 * 20 = 460

        int num6 = num1/num2;   // 1.0
        System.out.println(num1 + " / " + num2 + " = " + num6);
                        //  23 / 20 = (1 -- 1.15)

        /**
         * int/int --> int
         * double/int --> double
         * int/double --> double
         *
         * If all numbers are int -> final value will be int
         * If any one of the numbers is double -> final value will be double
         *
         */

        int result = (num1 + num2) - (num1 - num4) * num2 + num3;
                //  (23 + 20) - (23 - 3) * 20 + 43
                //  43 - (23 - 3) * 20 + 43
                //  43 - 20 * 20 + 43
                //  43 - 400 + 43
                //  - 357 + 43
                //  - 314
        System.out.println("result: " + result);

        /**
         * % -> Modulus operator
         *
         * 23/20 -> 1 (remaining -> 3)
         * 16/7 -> 2 (remaining -> 2)
         * 9/3 -> 3 (remaining -> 0)
         *
         * 23%20 -> 3
         * 16%7 -> 2
         * 9%3 -> 0
         *
         */
        System.out.println("40 % 5 -> " + 40%5);    // 0
        System.out.println("20 % 3 -> " + 20%3);    // 2
        System.out.println("11 % 4 -> " + 11%4);    // 3

        /**
         * increment (++)
         * post-increment and pre-increment
         *
         * int b = 10;
         * b++;     -->     post-increment
         * ++b;     -->     pre-increment
         *
         * ++
         *      increment the current value in variable by 1,
         *      and the new value will be in the SAME variable
         *
         */

        int inc = 5;
        inc++;      // inc = inc + 1
        System.out.println(inc);    // 6
        ++inc;      // inc = inc + 1
        System.out.println(inc);    // 7

        int a = 10;                 //  a = 10
        int b = a++;                // int b = a++; (b=10 , a=11)
        System.out.println(a++);    // print->11 , a=12
        System.out.println(++a);    // a=13 , print->13
        System.out.println(b);      // 10

        /**
         * post -> use the current of variable for whatever action/purpose,
         *          then increment the value in the variable.
         *
         * pre -> increment the value in the variable,
         *          then use the latest value of variable for whatever action/purpose.
         */

        int i1 = 1;                 // i1=1 ,
        int i2 = i1++;              // i2=1 , i1=2
        System.out.println(i1);     // 2
        System.out.println(i2);     // 1
        i2 = ++i1;                  // i2=3 , i1=3
        System.out.println(i2);     // 3
        System.out.println(i1);     // 3

        int ab = 5;
        System.out.println(ab);     // ab=5  | print->5
        System.out.println(ab++);   // print->5 | ab=6
        System.out.println(++ab);   // ab=7 | print->7
        System.out.println(ab);     // print->7 | ab->7
        System.out.println(ab++);   // print->7 | ab->8
        System.out.println(ab);     // print->8 | ab->8
        System.out.println(ab++);   // print->8 | ab->9
        System.out.println(ab++);   // print->9 | ab->10
        System.out.println(++ab);   // ab->11 | print->11
        System.out.println(ab++);   // print->11 | ab->12
        System.out.println(ab);     // print->12 | ab->12

        /**
         * decrement (--)
         * post-decrement and pre-decrement
         *
         * int b = 10;
         * b--;     -->     post-decrement
         * --b;     -->     pre-decrement
         *
         * --
         *      decrement the current value in variable by 1,
         *      and the new value will be in the SAME variable.
         *
         */
        System.out.println("\nDecrementing....\n");
        int dec = 10;
        System.out.println(dec--);  // print->10 | dec->9
        System.out.println(--dec);  // dec->8 | print->8








    }
}
