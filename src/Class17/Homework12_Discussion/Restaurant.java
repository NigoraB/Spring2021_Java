package Class17.Homework12_Discussion;

public class Restaurant {

    private String name;
    private int maxGuestCapacity, currentGuestCount, totalGuestsSoFar;

    public Restaurant(String resName, int resMaxCapacity) {
        name = resName;
        maxGuestCapacity = resMaxCapacity;
    }

    public boolean isSeatsAvailable(int seats) {
        boolean isAvailable = false;
        if (seats > 0) {
            if (maxGuestCapacity - currentGuestCount >= seats) {
                isAvailable = true;
            }
        } else {
            System.out.println("Checking for invalid seats: " + seats);
        }
        return isAvailable;
    }

    public void seatParty(int partySize) {
        if (partySize > 0) {
            currentGuestCount += partySize;
            totalGuestsSoFar += partySize;
        } else {
            System.out.println("Trying to seat invalid party size: " + partySize);
        }
    }

    public void removeParty(int partySize) {
        if (partySize > 0) {
            currentGuestCount -= partySize;
        } else {
            System.out.println("Trying to remove invalid party size: " + partySize);
        }
    }

    public void summary() {
        System.out.println("**** Summary ****" +
                "\nName: " + name +
                "\nMax Capacity: " + maxGuestCapacity +
                "\nCurrent Guest Count: " + currentGuestCount +
                "\nTotal guests served so far: " + totalGuestsSoFar);
    }

}
