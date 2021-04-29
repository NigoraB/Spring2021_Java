package Class16.AbstractPkg;

public abstract class AbstractTheory {

    /**
     *
     * Abstract Class - is a special type of class.
     * 1. This can contains abstract methods (methods without body)
     * and, it can also contain usual methods (methods with body)
     *
     * 2. To create Abstract class, we have to use "abstract" keyword after
     * the access-modifier while creating the class.
     *
     * 3. By default, all methods are normal methods.
     *  In order to create an abstract method, we have to use "abstract" keyword after
     *  the access-modifier while creating the method.
     *
     * 4. We can create variable of AbstractClass type,
     *  but we CANNOT create object of Abstract class.
     *
     *
     *
     *  AbstractTheory abc;
     *
     *  what is the datatype of abc? - AbstractTheory
     *
     */


    public void sayHello() {
        System.out.println("Hello World");
    }

    public abstract void sayBye();

    /**
     * Abstract Class vs Interface
     *
     * 1. Class implements the Interface, whereas extends Abstract Class.
     * 2. Interface is not a class, whereas Abstract-Class is a class.
     * 3. In Interface, all methods are abstract by default,
     *    whereas in Abstract class, we have to use "abstract" keyword to create abstract method.
     * 4. In Interface, to create method with body, we have to make it static,
     *    whereas in Abstract class, we can create method with body with/without making it static.
     *
     */


}
