package Class20;

import java.text.SimpleDateFormat;
import java.util.*;

public class Homework15_Discussion {
    public static void main(String[] args) {
        /**
         * Question:
         * Create a method that will take an int as input.
         * return the timeline (hour am/pm) with interval of 2 hour from the current hour.
         */

        // System.out.println(Arrays.toString(generateTimeline(5)));
        // 9pm 11pm 1am 3am 5am

        // sout(generateTimeline(5));       // running the code around 8am
        // 8am 10am 12pm 2pm 4pm


        // sout(generateTimeline(10));       // running the code around 8am
        // 8am 10am 12pm 2pm 4pm 6pm 8pm 10pm 12am 2am

        // String into int
        String str = "100";     // 100 (int)
        String str1 = "hello";  // Exception
        String str2 = "20$";    // Exception

        int strInt = Integer.parseInt(str);
        timeLine(5);

    }

    public static List<String> generateTimeline(int dataPoints) {
        // get current time
        Calendar cal = Calendar.getInstance();      // bcz we need to add 2 hours in curent time
        Date now = new Date();                      // -

        SimpleDateFormat df = new SimpleDateFormat("ha");
        String[] timeline = new String[dataPoints];
        List<String> timelineList = new ArrayList();

        for (int i=0 ; i < dataPoints ; i++) {
            if (i > 0) {
                // add 2 hrs
                cal.add(Calendar.HOUR, 2);
            }
            timeline[i] = df.format(cal.getTime());
            timelineList.add(df.format(cal.getTime()));
        }

        // System.out.println(Arrays.toString(timeline));
        // return timeline;
        return timelineList;

    }

    public static void timeLine(int length) {
        Calendar cal = Calendar.getInstance();
        List<String> listDates = new ArrayList<>();
        for (int i = 0; i < length * 2; i += 2) {   // i = 2
            if (listDates.size() < length) {
                cal.add(Calendar.HOUR, i);
                SimpleDateFormat df = new SimpleDateFormat("ha");
                String formattedDate = df.format(cal.getTime());
                listDates.add(formattedDate);
                System.out.print(formattedDate + " ");
            }
        }
        System.out.println("List " + listDates);
    }

}
