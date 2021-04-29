package Class15.InterfacePkg;

public interface InterfaceTheory {

    /**
     * Abstract Method: is a method which cannot have a body (code inside the method)
     */

    /**
     * 1. Interface looks like a class.
     * 2. All methods inside the Interface are abstract by default.
     * 3. We can create variable of an Interface, but CANNOT create object of an Interface.
     *      eg: InterfaceTheory it; <-- Allowed
     *          new InterfaceTheory() <-- Not allowed
     * 4. A class can implements an interface using 'implements' keyword.
     *    then class has to give body to all abstract methods of Interface.
     * 5. A class can implements one or more interfaces.
     * 6. In the interface variable, we can store the object of related class.
     * 7. An interface can extend another Interface (Inheritance in Interfaces).
     * 8. We can have normal-method (method with body) in Interface, it has to be Static method.
     *
     * class <--> class (Inheritance using extends keywords)
     *
     * Interface <--> Interface (Inheritance using extends keywords)
     *
     */

    public void greetUser(String username);

    public void sayByeUser(String username);

    public int addInts(int num1, int num2);



}
