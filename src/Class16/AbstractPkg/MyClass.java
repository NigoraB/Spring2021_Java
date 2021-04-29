package Class16.AbstractPkg;

import Class15.InterfacePkg.CarsInterface.GuidelinesEnvironment;

public class MyClass extends AbstractTheory implements GuidelinesEnvironment {



    public void add2Ints(int a, int b) {
        System.out.println(a+b);
    }


    public void sayBye() {
        System.out.println("Bye user");
    }

    @Override
    public void zeroEmission() {
        System.out.println("No emission");
    }
}
