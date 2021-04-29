package Class10.ClassEnrollment;

public class School {
    public static void main(String[] args) {

        Students s1 = new Students();
        /*
    static String schoolName = "ABC School";
    static String[] offeredCourses = {"QA", "Web", "PM"};
    static double[] feesCourses = {1000, 2000, 3000};
    static int totalStudents = 0;

    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentId;
    String studentAddress;
    double studentFeeBalance;
         */



        s1.enrollStudent("Happy", "NY", "PM");

        /*
    static int totalStudents = 1;

    String studentName = "Happy";
    String studentEnrolledCourse = "PM";
    int studentId = 1;
    String studentAddress = "NY";
    double studentFeeBalance = 3000;
         */


        Students s2 = new Students();
        /*
    static String schoolName = "ABC School";
    static String[] offeredCourses = {"QA", "Web", "PM"};
    static double[] feesCourses = {1000, 2000, 3000};
    static int totalStudents = 1;

    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentId;
    String studentAddress;
    double studentFeeBalance;
         */



        s2.enrollStudent("Happy", "NY", "qa");

        /*
    static int totalStudents = 2;

    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentId = 2;
    String studentAddress;
    double studentFeeBalance;
         */

        s1.displayStudentProfile();


        Students s3 = new Students();
        s3.enrollStudent("Fun" , "FL", "web");

        s3.displayStudentProfile();

        s2.displayStudentProfile();

        Students s4 = new Students();
        s4.enrollStudent("King", "qa");






    }


}
