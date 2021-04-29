package Class12.LabSession;

public class MyMethods extends MyClass {

    public void sendMesg(String name, boolean abc) {
        if (abc) {
            System.out.println("Bye " + name);
        } else {
            sayHelloToUser(name);
        }
    }

    public void sayHelloToUser(String name) {
        System.out.println("Hello " + name);
    }

    public void HeyUser(String username) {
        System.out.println("Hi " + username);
    }




}
