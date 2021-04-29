package Class16.LabSession;

import java.util.ArrayList;
import java.util.List;

public class LabSession2 {

    // public abstract void sayHello();

    public void sayBye() {
        System.out.println("Bye");
    }

    public static void main(String[] args) {

        int a = 10; // primitive variable which holds 10

        Integer b = new Integer(10);    // b non-primitive variable which holds 10

        // any object takes smaller space in memory as compare to any primitive datatype.

        // Create a List which can store 5 boolean values.
        List<Boolean> myList = new ArrayList<>();   // []

        // myList.set(0, false);   // IndexOutOfBoundsException

        System.out.println(myList.size());  //  0

        myList.add(false);

        System.out.println("myList --> " + myList);     // [false]

        // myList.remove(0);

        myList.set(myList.size()-1, !(myList.get(myList.size()-1)));
        /*
            myList.size()-1 --> 1-1 --> 0
            !(myList.get(myList.size()-1))
                myList.get(myList.size()-1)
                myList.get(0)
                false
             !(false) --> true

             myList.set(0, true);

         */

        System.out.println("myList --> " + myList);     //  [true]








    }

}
