package Class15.InterfacePkg.CarsInterface;

public class MercFactory implements Guidelines {

    public void putEngine() {
        System.out.println("Merc superb engine added");
    }

    public void putTyres(String tireTypes) {
        System.out.println("Added tyres of " + tireTypes + " type");
    }

    public void addSteering() {
        System.out.println("Steering wheel added");
    }

    public void addSeats(int numSeats) {
        System.out.println("Merc exclusive seats added");
    }

    public void salesTax() {
        System.out.println("Sales tax: 12%");
    }

    public void roadTax() {
        System.out.println("Road Tax: 5%");
    }

    public void putGlasses() {
        System.out.println("Bullet proof glasses installed");
    }

    public int addDoors(int numDoors) {
        System.out.println("Number of doors: " + numDoors);
        return numDoors;
    }



}
