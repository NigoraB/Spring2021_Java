package Class12.AccessModifier;

public class AccessModifier_Concept {

    private int num;
    private String name;
    private double dVar = 10;

    protected static int sNum;
    public static String sName;
    public static double sdVar;

    /**
     *  public : accessible from anywhere in the project
     *  protected : accessible within the package
     *  private : only accessible within the class
     *  default : same as protected
     */

    public void setNum(int val) {
        num = val;
        addNum(2, 4);
    }

    private void addNum(int a, int b) {
        System.out.println("name " + name);
        System.out.println(a + " + " + b + " = " + (a+b));
        subNum(10, 23);
    }

    protected void subNum(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a-b));
    }

    public void mulNum(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a*b));
    }

    public static void divNum(int a, int b) {
        if (b == 0) {
            System.out.println(a + " / " + b + " = 0");
        } else {
            System.out.println(a + " / " + b + " = " + (a/b));
        }
    }


}
