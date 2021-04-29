package Class19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_Set {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("hApPY");     // ["hApPY"]
        names.add("peace");     // ["hApPY", "peace"]
        names.add("joy");       // ["hApPY", "peace", "joy"]
        names.add("grow");      // ["hApPY", "peace", "joy", "grow"]
        names.add("peace");     // ["hApPY", "peace", "joy", "grow", "peace"]
        names.add("LearN");     // ["hApPY", "peace", "joy", "grow", "peace", "LearN"]
        names.add("joy");
        names.add("peace");
        names.add("happy");
        names.add("joy");
        names.add("world");


        /**
         * Create a Set and put all the values from List in the Set
         */
        Set<String> namesSet = new HashSet<>(names);

        System.out.println("namesSet --> " + namesSet);
        System.out.println("namesSet size --> " + namesSet.size());

        System.out.println("names --> " + names);
        System.out.println("names size --> " + names.size());


        /**
         * Create a List and put all values from a Set in the List
         */
        List<String> namesList = new ArrayList<>(namesSet);

        System.out.println("namesList --> " + namesList);
        System.out.println("namesList size --> " + namesList.size());

    }
}
