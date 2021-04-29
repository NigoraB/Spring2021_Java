package Class2.LabSession;

import java.text.DecimalFormat;

public class Homework3_LabDiscussion {
    public static void main(String[] args) {

        /**
         * Convert deg-Cel into Fahrenheit
         *
         * fT = cT × 9/5 + 32
         *
         */
        double cTemp = 21.111;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp + "°C --> " + fTemp + "°F");

        /**
         * Homework #3:
         * Refer for formula: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> F
         * K -> C
         *
         */
        double val = 1234.567890567890;
        DecimalFormat df = new DecimalFormat("##.###");
        System.out.println(df.format(val));


    }
}
