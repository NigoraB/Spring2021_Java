package Class17.Homework12_Discussion;

public class RestaurantSystem {
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant("One", 10);
        System.out.println(r1.isSeatsAvailable(5));
        r1.seatParty(5);

        r1.summary();

        r1.removeParty(3);

        r1.summary();

        r1.seatParty(6);

        r1.summary();




    }
}
