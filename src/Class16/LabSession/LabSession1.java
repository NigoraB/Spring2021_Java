package Class16.LabSession;

import Class16.AbstractPkg.MyClass;

import java.util.ArrayList;
import java.util.List;

public class LabSession1 {

    // public abstract void sayHello();

    public void sayBye() {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        // Create an ArrayList to store boolean values
        List<Boolean> myList = new ArrayList<>();

        // myList.set(myList.size()-1, true);

        // add false in myList
        myList.add(false);

        // myList.set(1, true);

        myList.set(myList.size()-1, true);

        // myList = [true]
        // myList.set(myList.size()-1, myList.remove(myList.size()-1));
        /*
            myList.set(myList.size()-1, myList.remove(myList.size()-1));
                myList.size()-1 --> 1-1 --> 0
                myList.remove(myList.size()-1)
                    myList.size()-1 --> 1-1 --> 0
                    myList.remove(0)    --> true --> returns true bcz true was present at index-0
                    myList --> []

            myList.set(0, true);
         */

        // System.out.println("myList --> " + myList); // []

        // myList = [true]
        myList.get(myList.size()-1);

        myList.remove(myList.get(myList.size()-1));
        // will this return something or not? or go in to exception

        System.out.println(myList); //





    }

}
