package Class12.Homework_11;

import com.sun.tools.classfile.ConstantPool;

public class Office {
    public static void main(String[] args) {

        Printer p1 = new Printer("P1 printer");

        Printer p2 = new Printer("P2 printer");

        Printer p3 = new Printer();

        p1.print(10);

        p1.printSummary();

        p2.printSummary();






    }
}
