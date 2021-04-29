package Class11.Inheritance;

public class CClass extends PClass {
    String childName = "Child";

    public void myChildMethod() {
        System.out.println("Inside the myChildMethod");
    }

    public void changeChildName(String newName) {
        childName = newName;
    }

    public void printChildName() {
        System.out.println("Name: " + childName);
    }

    public void myMethod() {
        super.myMethod();
        System.out.println("Child class myMethod");
    }

    /**
     * runParent method
     * run my code
     */
}
