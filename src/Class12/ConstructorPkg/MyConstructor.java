package Class12.ConstructorPkg;

public class MyConstructor {

    protected MyConstructor() {
        System.out.println("Inside the My Constructor method");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    /**
     * Constructor: It's a special method.
     *  1. It has SAME name as of the class.
     *  2. It DOES NOT have a return type, not even void.
     *  3. when we create an object, the constructor method gets called/executed AUTOMATICALLY.
     *      For normal method --> we use object to execute the method.
     *      For constructor --> when we create the object, the java will call/execute the constructor in order to create an object.
     *
     *  Syntax:
     *  public <same NAME AS OF CLASS>() {
     *      // code
     *  }
     *
     *  1. Constructor can be public, private or protected.
     *  2. Constructor can have arguments as well
     *  3. We can be more than one Constructor in a class. This is called 'Constructor Overloading'.
     *  4. In order to create object of a class, if there is no constructor defined by the user,
     *      java creates a default constructor (constructor with no parameter and no code) and executes it to create the object.
     *  5. If user defines a constructor; then Java never creates a default constructor.
     *  6. When do we create a private Constructor?
     */



}
