package name.lplade;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {
/*

        int studentsEnrolled = maintenance.getNumberOfStudents();
        System.out.println(maintenance.name + " has " +
                studentsEnrolled + " students");

        java.removeStudent("Gus");

        System.out.println("Java has " + java.getNumberOfStudents());

        int totalStudentEnrollment = 0;
        for (ITECCourse course : allCourse) {
            totalStudentEnrollment += course.getNumberOfStudents();
        }

        System.out.println("Total students = " + totalStudentEnrollment);
*/

        ITECCourse maintenance = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);
        maintenance.addStudents("Clara");
        maintenance.addStudents("Hillary");
        maintenance.addStudents("Donald");

        ITECCourse datacom = new ITECCourse("Data Communications", 1245, 30);
        datacom.addStudents("Horace");
        datacom.addStudents("Biff");

        ITECCourse java = new ITECCourse("Java Programming", 2545, 24);
        java.addStudents("Gus");
        java.addStudents("Harry");
        java.addStudents("Izzy");

        ITECCourse concepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        concepts.addStudents("Max");
        concepts.addStudents("Nancy");
        concepts.addStudents("Orson");

        ArrayList<ITECCourse> allCourse = new ArrayList<>();
        allCourse.add(java);
        allCourse.add(maintenance);
        allCourse.add(datacom);
        allCourse.add(concepts);

        for (ITECCourse course : allCourse) {
            String courseName = course.getName();
            int freeSpaces = course.getFreeSpaces();
            System.out.printf("%35s: %2d free spaces\n", courseName, freeSpaces);
        }

/*
        int studentsEnrolled = concepts.getNumberOfStudents();
        System.out.println(concepts.getName() + " has " +
                studentsEnrolled + " students");

                */


    }
}
