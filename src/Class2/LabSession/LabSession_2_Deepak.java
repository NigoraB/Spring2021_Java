package Class2.LabSession;

public class LabSession_2_Deepak {
    public static void main(String[] args) {
        int num1 = 22;
        double num2 = 3;

        double addNum1Num2 = num1 + num2;   // int + double --> double

        double divNum1Num2 = num1 / num2;    // int/double -> double

        /**
         * Modulus Operator
         *
         * 22/3 -> 7 , remainder=1
         *
         * 22%3 -> 1
         *
         * 16%2 -> 0
         *
         * 20%3 -> 2
         *
         * 11%4 -> 3
         *
         */

        int i = 10;
        int j = i++ + 20;
        /*
            int j = i + 20; // j = 10 + 20
            i = i+1;        // i = 11
         */

        System.out.println(j);  // 30
        System.out.println(i);  // 11


        int k = ++j + i++;  // pre-j, add, post-i
        /*
            j = j + 1 (30+1) 31
            int k = j + i   (31+11) 42
            i = i + 1 (11+1) 12
         */

        System.out.println(j);      // 31
        System.out.println(i);      // 12
        System.out.println(++k);
        /*
            k = k + 1   (42+1) 43
            sout(k)                 // 43
         */

        k = ++j + ++i;  // pre-j, add, pre-i
        /*
            j = j+1     // 32
            i = i+1     // 13
            j + i       // 45
         */
        System.out.println(k);


        char fIni = 'a', lIni = 'b';

        System.out.println(fIni == lIni);   // false

        System.out.println(200 >= 200);     // true






    }
}
