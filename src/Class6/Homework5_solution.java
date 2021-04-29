package Class6;

public class Homework5_solution {
    public static void main(String[] args) {

        // Due: March 11th

        // String fullName = "kaPPy    peace";
        /**
         * 1. Does first name start with 'K' (ignore cases)
         * 2. If user has a last name, Does last name ends with 'a' (ignore cases)
         *      else print, "No last name entered"
         * 3. If user has a last name, print the 1st letter of last name
         *      else print, "No last name entered"
         * 4. Print the number of letters in the first name.
         */
        /*
            Does first name start with 'K' (ignore cases)
            #1:
                extract first-name form full name
                     (use split by ' ') --> String[] splitName = ["kaPPy"]
                     String firstName = splitName[0];
                and verify first-name starts with 'k' or not.
                    firstName.toUppercase().startsWith('K')

            #2:
                verify full-name starts with 'k' or not
                    fullName.toUppercase().startWith('K')
         */
        /*
         2. If user has a last name, Does last name ends with 'a' (ignore cases)
               else print, "No last name entered"

           1. find out if user has lastName
               use split by ' ' --> String[]    "kaPPy peace"   --> ["kaPPy" , "peace"]
           2. if length of Array >= 2, means user has a last name
           3. Does lastname ends with 'a'
                #1: check if fullname ends with 'a'
                    fullName.trim().toLowercase().endsWith('a')

                #2: check if lastname ends with 'a'
                    "kaPPy peace"   --> ["kaPPy" , "peace"]     --> arr[1]
                    "kaPPy learn peace"   --> ["kaPPy" , "learn" , "peace"] --> arr[2]
                    "kaPPy learn grow peace"   --> ["kaPPy" , "learn" , "grow" , "peace"] --> arr[3]
                    use split by ' ' --> String[]
                    int lastIndex = length of array -1
                    String lastName = arr[lastIndex]
                    lastName..toLowercase().endsWith('a');
         */
        String fullName = "kaPPy peace";
        String[] splitName = fullName.split(" ");   // ["kaPPy" , , , , "peace"]
        if (splitName.length >= 2) {
//            #1
//            boolean lastnameEndsWith_a = fullName.trim().toLowerCase().endsWith("a");
//            System.out.println("Does last name ends with 'a'? : " + lastnameEndsWith_a);

//            #2
            int lastIndex = splitName.length-1;         // lastIndex = 1
            String lastName = splitName[lastIndex];     // lastName = splitName[1] ("peace")
            boolean lastnameEndsWith_a = lastName.toLowerCase().endsWith("a");
            System.out.println("Does last name ends with 'a'? : " + lastnameEndsWith_a);

        } else {
            System.out.println("No last name entered");
        }




        /**
         * String threeWordsSentence_1 =  "hApPY nEW yeAr";
         * sout(threeWordsSentence_1);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence_1);  // Happy New Year
         */





        /**
         * Create abbreviation:
         * String threeWordsSentence_2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        /*
            String threeWordsSentence_2 =  "Lab    sessIONS        clAsses";
            use split ("\\s+") --> String[] words --> ["Lab" , "sessIONS" , "clAsses"]
            String abr = words[0].charAt(0) +  words[1].charAt(0) + words[2].charAt(0)  // Lsc
            abr = abr.toUpperCase();    // LSC

            sout(abr);

         */


        /**
         * String sentence_4 = "We all are here to learn good stuff";
         * Print the number of words in the sentence.
         *
         */

    }
}
