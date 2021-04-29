package Class18.LabSession;

import java.util.*;

public class LabSession2 {
    public static void main(String[] args) {

        Set<Double> interestRates = new HashSet<>();
        interestRates.add(1.1);
        interestRates.add(2.2);
        interestRates.add(12.2);
        interestRates.add(1.11);
        interestRates.add(2.0);
        interestRates.add(13.1);
        interestRates.add(22.0);
        interestRates.add(1.2);

        /**
         * find the max mortgage rate?
         */
        Double maxRate = -1.0;

        for (Double rate : interestRates) {
            if (rate > maxRate) {
                maxRate = rate;
            }
        }
        // System.out.println("max rate: " + maxRate);

        /**
         * find the min mortgage rate
         *
         * 1.1
         */

        /**
         * find the max 3 mortgage rates.
         *
         * 22.0, 13.1, 12.2
         */


        Map<String, Integer> colorCount = new HashMap<>();
        colorCount.put("green", 10);
        colorCount.put("red", 21);
        colorCount.put("blue", 43);
        colorCount.put("orange", 12);
        colorCount.put("violet", 10);
        colorCount.put("pink", 65);
        colorCount.put("white", 7);
        colorCount.put("black", 10);

        /**
         * Print the color name with max count.
         *
         * pink
         */
/*
        Collection<Integer> colorValues = colorCount.values();      // 10, 10, 10, 12, 21, 65, 43, 7
        int maxValue = 0;
        for (int value : colorValues){
            if (value > maxValue){
                maxValue = value;
            }
        }
        System.out.println(maxValue);   // 65

        Set<String> allKeys = colorCount.keySet();

        for (String key : allKeys) {
            if (colorCount.get(key) == maxValue) {
                System.out.println("Max color count is for " + key + " with count = " + colorCount.get(key));
                break;
            }
        }
*/
        // ----

        int maxCount = -1;
        String maxColorName = "";

        Set<String> colorKeys = colorCount.keySet();

        for (String color : colorKeys) {
            if (colorCount.get(color) > maxCount) {
                maxCount = colorCount.get(color);
                maxColorName = color;
            }
        }
        // System.out.println("Max color count is for " + maxColorName + " with count = " + maxCount);


        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(101,"happy");
        myMap.put(10,"job");
        myMap.put(908,"learn");
        myMap.put(1111,"grow");
        myMap.put(76,"HappY");

        Integer checkKey = 22;

//        if (myMap.containsKey(checkKey)) {
//            if (myMap.get(checkKey).length() > 4) {
//                System.out.println(myMap.get(checkKey));
//            } else {
//                System.out.println("value not greater than 4");
//            }
//        } else {
//            System.out.println("key not available");
//        }


        Set<Integer> keys = myMap.keySet();
        String output = "";
        for (Integer key : keys) {
            if (key.equals(checkKey)) {
                String keyValue = myMap.get(key);
                if (keyValue.length() > 4) {
                    output = keyValue;
                    break;
                } else {
                    output = "value not greater than 4";
                    break;
                }
            } else {
                output = "key not available";
            }
        }
        System.out.println(output);
            // write code here

        // if value with given key is of length greater than 4 -->
        //      print the value
        //
        // else -->
        //      print 'value not greater than 4'
        //
        // if the given key is not found -->
        //      print 'key not available'


        /**
         * Student name: john
         * Student Score: 90, 89, 76, 89, 100
         *
         * Student name: harry
         * Student Score: 70, 89, 76, 89, 100
         *
         * Student name: reene
         * Student Score: 90, 77, 98, 98, 100
         *
         * Student name: domino
         * Student Score: 90, 89, 100, 89, 100
         *
         * Student name: joy
         * Student Score: 89, 89, 77, 89, 98
         *
         * Store the data in a appropriate variable.
         *
         */

        /*
            "john" = {90, 89, 76, 89, 100}
         */

        Map<String, Integer[]> scoreCard = new HashMap<>();

        Integer[] johnScores = {90, 89, 76, 89, 100};
        scoreCard.put("john" , johnScores);

        Integer[] harryScores = {70, 89, 76, 89, 100};
        scoreCard.put("harry", harryScores);

        Integer[] reeneScores = {90, 77, 98, 98, 100};
        scoreCard.put("reene" , reeneScores);

        Integer[] dominoScores = {90, 89, 100, 89, 100};
        scoreCard.put("domino", dominoScores);

        Integer[] joyScores = {89, 89, 77, 89, 98};
        scoreCard.put("joy", joyScores);

        /**
         * find the name of class topper.
         * print the name with his/her score.
         */


    }
}
