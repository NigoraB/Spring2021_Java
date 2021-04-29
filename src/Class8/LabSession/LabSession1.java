package Class8.LabSession;

import java.util.Arrays;

public class LabSession1 {
    public static void main(String[] args) {

        /**
         * Write a code to reverse an int-array
         */
        int[] myArray = {11, 44, 22, 66, 44, 76, 54, 22, 55};
        // myReverseArray --> {76, 44, 66, 22, 44, 11}
        int[] myReverseArray = new int[myArray.length];

        /*
            myReverseArray[0] = myArray[myArray.length-1-0];
            myReverseArray[1] = myArray[myArray.length-1-1];
         */

        for (int i=0; i < myArray.length; i++){
            myReverseArray[i] = myArray[myArray.length-1-i];
        }
        System.out.println(Arrays.toString(myReverseArray));


        /**
         * Count the number of times a given string is present in a given paragraph.
         */
        String paragraph = "Are you searching for Essay Writing Topics in English for various competitions and speeches for school events? Then you are on the right page here you will get all kinds of topics for essay writing in English. As we have gathered numerous essay topics in long and short forms for all classes students. Yes, what you heard is correct, this page is filled with Long essays for class 10, 9, 8, 7, and Short essays for class 6, 5, 4, 3, 2, 1. So, anyone can check out this Essay Writing in English Article on AplusTopper for school events & competitions. Moreover, you can also find 10 lines on the selected far topic in English for the speeches in school programs. These Ten lines in English will assists students and teachers at the time of school speeches on special events. Hence, students can refer to the below provided a massive list of essays in English and participate in any kind of events conducted by schools. For the sake of class 1 to 10 students, we have also covered 10 Lines and Essay on ‘My School’ in English and Hindi here.";
        String wordToFind = "SCHOOL";

        String[] lowerPhararagraph = paragraph.toLowerCase().split(" ");
        String lowerWordTOFind = wordToFind.toLowerCase();
        int count = 0;
        for (int i=0; i<lowerPhararagraph.length; i++) {
            if (lowerPhararagraph[i].contains(lowerWordTOFind)) {
                count++;
            }
        }
        System.out.println(count);


        /**
         * Store the index of three 'happy' present in given array
         *
         * [1, 3, 8]
         */
        String[] myWords = {"peace", "Happy", "happiness", "haPPy", "grow", "happYss", "Learn", "Help", "HappY", "Listen", "Peace"};

//        int j = 0;
//        int[] numbers = new int[3];
//        for (int i = 0; i <myWords.length; i++) {
//            if (myWords[i].equalsIgnoreCase("happy")) {
//                numbers[j] = i;
//                if (j > 2) {
//                    break;
//                } else {
//                    j++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
        /*
            i=0, j=0
            words[i] = peace
            myWords[i].equalsIgnoreCase("happy") --> false

            i=1, j=0
            words[i] = Happy
            myWords[i].equalsIgnoreCase("happy") --> true
                numbers[j] = i
                j++

            i=2, j=1
            words[i] = happiness
            myWords[i].equalsIgnoreCase("happy") --> false

            i=3, j=1
            words[i] = haPPy
            myWords[i].equalsIgnoreCase("happy") --> true
                number[j] = i
                j++

         */

        /**
         * Store the index of ALL 'happy' present in given array (ignoring cases)
         *
         */
        // String[] myWords = {"peace", "Happy", "happiness", "haPPy", "grow", "happYss", "Learn", "Help", "HappY", "Listen", "Peace"};
        wordToFind = "haPPY";
        int counter = 0;
        for(int k=0; k < myWords.length; k++){
            if(myWords[k].equalsIgnoreCase(wordToFind)) {
                counter++;
            }
        }
        int j1 = 0;
        int[] indexOfFoundWord = new int[counter];
        for (int h = 0; h < myWords.length; h++) {
            if (myWords[h].equalsIgnoreCase(wordToFind)) {
                indexOfFoundWord[j1] = h;
                j1++;
            }
        }
        System.out.println("Final answer: " + Arrays.toString(indexOfFoundWord));






    }
}
