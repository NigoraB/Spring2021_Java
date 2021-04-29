package Class19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Class {
    public static void main(String[] args) {

        // Date
        Date currentTimeDate = new Date();

        System.out.println(currentTimeDate);

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//
//        }
//
//        currentTimeDate = new Date();
//
//        System.out.println(currentTimeDate);

        // https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat df = new SimpleDateFormat("MMMM d/yy hh:mm:ss a");

        String minutes = df.format(currentTimeDate);

        System.out.println("minutes -> " + minutes);

        /**
         * MM : month in number
         * MMM : month in abbreviation (Jan, Feb etc)
         * MMMM : month in full name
         */

        /**
         * current date -> 7
         * "d"  -> 7
         * "dd" -> 07
         *
         * current date -> 17
         * "d"  ->  17
         * "dd" ->  17
         */

        /**
         * yyyy : 2021
         * yy : 21
         */


        /**
         * print "In first half" is current date is less or equal to 15
         * else print "In second half"
         */
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("d");

        String currDate = sdf.format(now);      // "26"

        // "26" --> 26
        int currDateInt = Integer.valueOf(currDate);

        if (currDateInt <= 15) {
            System.out.println("In first half");
        } else {
            System.out.println("In second half");
        }

        /**
         * Convert String into Date object
         */
        Date convertedDate = null;
        String dateText = "April 02 2021, 19:00:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM dd yyyy, HH:mm:ss");

        try {
            convertedDate = sdf2.parse(dateText);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Converted Date --> " + convertedDate);  // Fri Apr 02 19:00:00 EDT 2021
        System.out.println("now Date --> " + now);                  // Mon Apr 26 20:47:06 EDT 2021

        // is now equal to convertedDate
        boolean isNowEqualsConvertedDate = now.equals(convertedDate);
        System.out.println("is now equals to convertedDate : " + isNowEqualsConvertedDate);

        // is now comes after to convertedDate
        boolean isNowAfterConvertedDate = now.after(convertedDate);
        System.out.println("is now come after convertedDate : " + isNowAfterConvertedDate);

        // is now comes before to convertedDate
        boolean isNowBeforeConvertedDate = now.before(convertedDate);
        System.out.println("is now come before convertedDate : " + isNowBeforeConvertedDate);

    }
}
