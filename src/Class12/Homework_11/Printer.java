package Class12.Homework_11;

public class Printer {
    private final int maxPages = 100;
    private final int maxToner = 100;
    private String name = "Default Printer name";

    private int currentPaperCount = maxPages, currentTonerCount = maxToner;

    public Printer() {}

    public Printer(String pName) {
        name = pName;
    }

    public void editName(String printerName) {
        name = printerName;
    }

    /**
     * print for single side
     *
     * inputs:
     *  1 int papersToPrint
     *
     * return type:
     *  int[]
     *
     * papersToPrint <= currentPaperCount
     * papersToPrint > 0
     * papersToPrint <= currentTonerCount
     *      currentPaperCount = currentPaperCount - papersToPrint
     *      currentTonerCount = currentTonerCount - papersToPrint
     * else
     *      Invalid papersToPrint
     *
     */
    public void print(int papersToPrint) {
        if (papersToPrint > 0 &&
                papersToPrint <= currentPaperCount &&
                papersToPrint <= currentTonerCount) {
            currentTonerCount = currentTonerCount - papersToPrint;
            currentPaperCount = currentPaperCount - papersToPrint;
            System.out.println("Printing done successfully");
        } else {
            System.out.println("Invalid papers to print : " + papersToPrint);
        }
//        int[] currentStats = {currentPaperCount, currentTonerCount};
//        return currentStats;
    }

    public void printSummary() {
        System.out.println("Printer Summary::\nName: " + name +
                "\nCurrent page count: " + currentPaperCount +
                "\nCurrent Toner count: " + currentTonerCount );
    }




}
