package Class15.InterfacePkg.CarsInterface;

public interface Guidelines extends GovtInterface {

    public void putEngine();

    public void putTyres(String tireTypes);

    public void addSteering();

    public int addDoors(int numDoors);

    public void addSeats(int numSeats);

    public void putGlasses();

    public static void myMethod() {
        System.out.println("Static method in Guidelines Interface");
    }


}
