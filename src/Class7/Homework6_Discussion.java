package Class7;

public class Homework6_Discussion {
    public static void main(String[] args) {

        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        double studentScore = 400;
        double maxScore = 700;
        // calculate percentage
        // Your percentage: XX.yy and your Grade is: Z

        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */



        /**
         * Checking car gear (P, D, N, R)           // switch
         * if car gear is P, display "you can park the car"
         * if car gear is D,
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car gear is N, display "put car in car wash"
         * if car gear is R, display  "revere the car"
         */
        char carGear = 'P';
        String driveType = "";

        switch (carGear) {
            case 'P':
            case 'p':
                System.out.println("");
                break;
            case 'D':
                switch (driveType.toUpperCase()) {
                    case "SNOW":
                        System.out.println("You are in Snow mode");
                        break;
                    case "SPORT":
                        System.out.println("You are in Sport mode");
                        break;
                    case "ECO":
                        System.out.println("You are in Eco mode");
                        break;
                    default:
                        System.out.println("You are invalid drive type: " + driveType);
                }
            case 'N':
                System.out.println("Put car in car wash");
                break;
            default:
                System.out.println("Invalid gear entered: " + carGear);

        }
















    }
}
