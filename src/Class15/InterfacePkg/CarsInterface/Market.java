package Class15.InterfacePkg.CarsInterface;

import Class15.CodeTest_Discussion;

public class Market {
    public static void main(String[] args) {

        BMWFactory b1 = new BMWFactory();

        Guidelines gl = new MercFactory();
        gl.putEngine();
        gl = new BMWFactory();
        gl.putEngine();

        gl = new MercFactory();

        GovtInterface gi = new BMWFactory();

        Guidelines.myMethod();

        GuidelinesEnvironment ge;
        ge = new BMWFactory();
        ge.zeroEmission();







    }
}
