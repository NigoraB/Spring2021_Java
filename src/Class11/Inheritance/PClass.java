package Class11.Inheritance;

import Class11.OOPS_Concept;

public class PClass extends OOPS_Concept {

    String parentName = "Parent";

    public void myParentMethod() {
        System.out.println("Inside the myParentMethod");
    }

    public void changeParentName(String newName) {
        parentName = newName;
    }

    public void printParentName() {
        System.out.println("Name: " + parentName);
    }

    public void myMethod() {
        System.out.println("Parent Class myMethod");
    }

    public void sayHelloToUser(String username) {
        System.out.println("Hello " + username);
    }



}
