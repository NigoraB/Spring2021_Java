package Class18.LabSession;

import java.util.*;

public class LabSession1 {
    public static void main(String[] args) {

        Set<Double> mySet = new HashSet<>();
        mySet.add(1.1);
        mySet.add(2.2);
        mySet.add(12.2);
        mySet.add(1.11);
        mySet.add(2.0);
        mySet.add(13.1);
        mySet.add(22.0);
        mySet.add(1.2);


        // 12.2
        // 13.1
        // 22.0

        /*
            pick-index-0
            if (index-0-val > 10)
                print index-0-val
         */

        for (Double d : mySet) {
            if (d > 10) {
                System.out.println(d);
            }
        }

        // --------------------------

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(101,"happy");
        myMap.put(10,"job");
        myMap.put(908,"learn");
        myMap.put(1111,"grow");
        myMap.put(76,"HappY");

        Integer checkKey = 22;


        // write code here

        // if value with given key is of length greater than 4 -->
        //      print the value
        // else -->
        //      print 'value not greater than 4'
        // if the given key is not found -->
        //      print 'key not available'


        if (myMap.containsKey(checkKey)) {
            if (myMap.get(checkKey).length() > 4) {
                System.out.println(myMap.get(checkKey));
            } else {
                System.out.println("value not greater than 4");
            }
        } else {
            System.out.println(checkKey + " - key not available");
        }


        /**
         * print all the keys from given Map
         * which has valueLength > 4
         *
            Map<Integer, String> myMap = new HashMap<>();
            myMap.put(101,"happy");
            myMap.put(10,"job");
            myMap.put(908,"learn");
            myMap.put(1111,"grow");
            myMap.put(76,"HappY");
         *
         * 101
         * 908
         * 76
         */

        for (Integer key: myMap.keySet()) {
            if (myMap.containsKey(key)){
                if (myMap.get(key).length()>4){
                    System.out.println(key);
                }
            }
        }

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

//        Map<String, Integer[]>  scores = new HashMap<>();
//        Integer[] studentScores = {90, 89, 76, 89, 100};
//        scores.put("john", studentScores);

        Map<String, List<Integer>>  scores2 = new HashMap<>();

        Integer[] johnScores = {90, 89, 76, 89, 100};
        List<Integer> studentScores2 = Arrays.asList(johnScores);
        scores2.put("john", studentScores2);

        Integer[] harryScores = {70, 89, 76, 89, 100};
        List<Integer> harryScoresList = Arrays.asList(harryScores);
        scores2.put("harry",harryScoresList);

        Integer[] renneScores = {90, 77, 98, 98, 100};
        List<Integer> renneScoresList = Arrays.asList(renneScores);
        scores2.put("renne",renneScoresList);

        Integer[] dominoScores = {90, 89, 100, 89, 100};
        List<Integer> dominoScoresList = Arrays.asList(dominoScores);
        scores2.put("domino", dominoScoresList);

        Integer[] joyScores = {89, 89, 77, 89, 200};
        List<Integer> joyScoresList = Arrays.asList(joyScores);
        scores2.put("joy",joyScoresList);

        Collection<String> studentNames = scores2.keySet();
        Map<String, Integer> totalScore = new HashMap<>();

        for (String studentName : studentNames) {
            List<Integer> studentScore = scores2.get(studentName);
            int total = 0;
            for (Integer score : studentScore) {
                total += score;
            }
            totalScore.put(studentName, total);
        }

        int maxScore = 0;
        String topper = "";

        for (String studentName : studentNames) {
            if (totalScore.get(studentName) > maxScore) {
                topper = studentName;
                maxScore = totalScore.get(studentName);
            }
        }

        System.out.println("Topper : " + topper);
        System.out.println("Max Score : " + maxScore);


























    }
}
