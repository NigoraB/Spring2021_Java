package Class3;

public class JavaOperators_AdvancedAssignment {
    public static void main(String_Concept[] args) {

        /**
         * Advanced Assignment (+=, -=, *=, /=, %=)
         *
         * ++   ->  increment by 1
         *
         * int num = 15;
         * using increment operator to add 5 int num.
         *
         * num++
         * num++
         * num++
         * num++
         * num++
         *
         * num+=5 <--> num = num + 5
         *
         */

        int var1 = 10;
        var1+=5;    // ( var = var1 + 5 )
        System.out.println("var1 = " + var1);   // 15

        var1-=2;    // ( var = var1 - 2 )
        System.out.println("var1 = " + var1);   // 13

        var1*=10;   // ( var = var1 * 10 )
        System.out.println("var1 = " + var1);   // 130

        var1/=9;    // ( var = var1 / 9 )
        System.out.println("var1 = " + var1);   // 14

        var1%=9;    // ( var = var1 % 9 )
        System.out.println("var1 = " + var1);   // 5

    }
}
