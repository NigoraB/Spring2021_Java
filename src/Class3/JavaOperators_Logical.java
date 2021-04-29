package Class3;

public class JavaOperators_Logical {
    public static void main(String_Concept[] args) {

        /**
         * Logical (&&, ||, !)
         *
         *
         * is today weekday? -> true
         *
         * is it raining right now? --> false
         *
         *
         * is today weekday? and is it raining right now? --> false
         *
         * (is today weekday? or is it raining right now?) and are you from New York? --> true
         *
         *
         *
         * creditScore > 700 and is customer first time home buyer? ---> 1.1
         * not of (creditScore > 700 or is customer first time home buyer?) ---> 1.1
         *
         * &&   --> and operator
         * ||   --> or operator
         * !    --> not operator
         *
         * We use logical operators to join two or more conditions.
         * Final result will always be a boolean datatype.
         *
         * && operator ->
         *  all combined conditions must be true to get final result as true.
         *  If any one of the conditions is false, final result is false.
         *
         * || operator ->
         *  any one of the combined conditions is to be true to get final result as true.
         *  If all conditions are false, then only final result will be false.
         *
         *
         *  ! operator ->
         *      not operator will make true as false and vice-versa.
         *
         *
         *
         *
         *
         */

        int lVar1=10, lVar2=20, lVar3=30, lVar4=40;

        boolean lRes1 = lVar1 <= lVar3 && (lVar2 == (lVar4+lVar1-lVar3));
        /*
            lVar1 <= lVar3 && (lVar2 == (lVar4+lVar1-lVar3))
                true && (lVar2 == (40+10-30))
                true && (lVar2 == 20)
                true && true
                true


            lVar1 <= lVar3 && lVar2 == lVar4
            true && false
            false
         */
        System.out.println("lRes1 -> " + lRes1);


        boolean lRes2 = lVar1 > lVar3 || (lVar2 == (lVar4+lVar1-lVar3));
        /*
            lVar1 > lVar3 || (lVar2 == (lVar4+lVar1-lVar3))
                false || true
                true

         */
        System.out.println("lRes2 -> " + lRes2);

        boolean lRes3 = lVar3 > lVar1 || (lVar2+lVar3-lVar1==lVar4 && lVar1+lVar4<lVar2+lVar3);
        /*
            lVar3 > lVar1 || (lVar2+lVar3-lVar1==lVar4 && lVar1+lVar4<lVar2+lVar3)
                true || (true && false)
                true || false
                true
         */


        boolean lRes4 = (lVar3 > lVar1 || !(lVar4+lVar1<=lVar2*4)) && (lVar2+lVar3-lVar1==lVar4 && !(lVar1+lVar4<lVar2+lVar3));
        /*
            (lVar3 > lVar1 || !(lVar4+lVar1<=lVar2*4)) && (lVar2+lVar3-lVar1==lVar4 && !(lVar1+lVar4<lVar2+lVar3));
                (30 > 10 || !(lVar4+lVar1<=lVar2*4))
                (true || !(40+10 <= 20*4))
                (true || !(50 <= 80))
                (true || !(true))
                (true || false)
                (true)

                (lVar2+lVar3-lVar1==lVar4 && !(lVar1+lVar4<lVar2+lVar3));
                (20+30-10 == 40 && !(10+40 < 20+30))
                (40 == 40 && !(50 < 50))
                (true && !(false))
                (true && true)
                (true)

                true && true
                true
         */













    }
}
