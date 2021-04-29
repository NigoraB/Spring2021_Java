package Class12.ClassEnrollment;

import java.util.Arrays;

public class Students {

    /**
     * Variable which will store values like:
     * school name
     * student name
     * student id
     * student enrolled course name
     * courses offered by school
     * total number of students
     * student fee-balance
     * student address
     */
    static String schoolName = "ABC School";
    static String[] offeredCourses = {"QA", "Web", "PM"};
    static double[] feesCourses = {1000, 2000, 3000};
    static int totalStudents = 0;

    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentId;
    String studentAddress;
    double studentFeeBalance;
    double studentDepositedAmount;

    /**
     * Student can enroll by providing:
     *  name, addr and course
     *  name, course
     *  name, addr, course, phoneNumber
     */

    public Students(String name, String addr, String course) {
        /*
            if course is available in school, we should inform student the fees-balance
            increase the total number of students
            we should student the studentId
         */
        boolean isCourseAvailable = false;
        for (int i=0 ; i<offeredCourses.length ; i++) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                totalStudents++;
                studentId = totalStudents;
                isCourseAvailable = true;
                studentName = name;
                studentEnrolledCourse = offeredCourses[i];
                studentFeeBalance = feesCourses[i];
                studentAddress = addr;
                break;
            }
        }
        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student id -> " + studentId);
        } else {
            System.out.println("Requested course " + course + " is not available in the school");
        }

    }

    public Students(String name, String course) {
        boolean isCourseAvailable = false;
        for (int i=0 ; i<offeredCourses.length ; i++) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                totalStudents++;
                studentId = totalStudents;
                isCourseAvailable = true;
                studentName = name;
                studentEnrolledCourse = offeredCourses[i];
                studentFeeBalance = feesCourses[i];
                break;
            }
        }
        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student id -> " + studentId);
        } else {
            System.out.println("Requested course " + course + " is not available in the school");
        }

    }

    public Students(String name, String addr, String phone, String course) {
        boolean isCourseAvailable = false;
        for (int i=0 ; i<offeredCourses.length ; i++) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                totalStudents++;
                studentId = totalStudents;
                isCourseAvailable = true;
                studentName = name;
                studentEnrolledCourse = offeredCourses[i];
                studentFeeBalance = feesCourses[i];
                break;
            }
        }
        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student id -> " + studentId);
        } else {
            System.out.println("Requested course " + course + " is not available in the school");
        }

    }

    /**
     * Method to display student profile
     * Id
     * Name
     * Course
     *
     *
     * name: displayStudentProfile
     * Input: N/A
     * Return Type: String/void
     *
     */
    public void displayStudentProfile() {
        System.out.println("Student profile " +
                "\nStudent id: " + studentId +
                "\nStudent name: " + studentName +
                "\nStudent course: " + studentEnrolledCourse + "\n\n");
    }

    /**
     * Method to fee deposit
     *
     * name: feeDeposit
     * Input: double
     * return: double
     */


    /**
     * Student to change course
     * Req:
     * 1. earlier deposited fees should be subtracted from new course fees
     * 2. Show error (saying, Same course entered) if student enter enrolled course as new course
     * 3. Show error (saying, Invalid course entered) if student enter a course not offered by school
     *
     * student coming has request to change course to B
     *
     * does course 'X' exist in offeredCourses? {"QA", "Web", "PM"};
     *      sout(Invalid course entered)
     * is the student's current course not 'X'? studentEnrolledCourse
     *      sout(Same course entered)
     * if above two conditions are false
     *      find the amount deposited by student
     *      find the fees of new course
     *      subtract newFees from prevDepositedAmount
     *      studentEnrolledCourse = X
     *
     */


    /**
     * static Method to display school summary:
     * School Name
     * Courses Offered
     * Total number of student
     */

    public static void schoolSummary() {
        System.out.println("School Name--> "+schoolName +
                "\nCourses offered: "+ Arrays.toString(offeredCourses) +
                "\nTotal number of Student: "+totalStudents);
    }
















}
