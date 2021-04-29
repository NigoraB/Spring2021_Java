package Class15.InterfacePkg.CarsInterface;

public class BMWFactory implements Guidelines, GuidelinesEnvironment {

    public void putEngine() {
        System.out.println("Basic engine added");
    }

    public void putTyres(String tireTypes) {
        System.out.println("Added " + tireTypes + " type of tyres");
    }

    public void addSteering() {
        System.out.println("Added heated steering");
    }

    public void addSeats(int numSeats) {
        System.out.println("Added " + numSeats + " seats");
    }

    public void BMWPlusPkg() {
        System.out.println("Congratulations, you bought BMW Plus package");
    }

    public void zeroEmission() {
        System.out.println("Latest zero emission car");
    }

    public void salesTax() {
        System.out.println("10% Sales tax added");
    }

    public void roadTax() {
        System.out.println("No road tax");
    }

    public void putGlasses() {
        System.out.println("Glasses installed");
    }

    public int addDoors(int numDoors) {
        System.out.println("Number of doors: " + numDoors);
        return numDoors;
    }
}
