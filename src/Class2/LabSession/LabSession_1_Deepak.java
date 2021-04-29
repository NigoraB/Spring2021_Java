package Class2.LabSession;

public class LabSession_1_Deepak {

    public static void main(String[] args) {

        int i = 10;

        int j = i++ + 10;   // j=i+10 , j=20 | i++ , i=11
                // 10 + 10 (i=11)

        System.out.println(j);  // 20
        System.out.println(i);  // 11

        System.out.println(j);  // 20

        int k = ++j + i++;
        /*
            j=j+1           // j=21
            int k = j + i   // k = 21 + 11 = 32
            i = i+1         // i=12

         */

        System.out.println(i);  // 12
        System.out.println(j);  // 21
        System.out.println(k);  // 32

        char fInitial = 'H';
        char lInitial = 'L';

        System.out.println(fInitial == lInitial);   // false
        System.out.println(fInitial != lInitial);   // true

        System.out.println(i > j);






    }

}
