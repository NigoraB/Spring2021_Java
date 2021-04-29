package Class11.Inheritance;

public class MyMainClass {
    public static void main(String[] args) {

        // PClass pc1 = new PClass();
        // using pc1, can access anything from PClass



        CClass cc1 = new CClass();
        // using cc1, can access anything from CClass and PClass

        cc1.printChildName();

        cc1.printParentName();



    }

    public void addArrayNumbers(int[] arr, int n) {
        //
    }

}
