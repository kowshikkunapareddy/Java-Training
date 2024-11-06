package day4;

public class Student_Grades {

    public static void main(String[] args) {

        // Logic for Student Grades based on the marks
        int marks = 59;

        if (marks >= 90) {
            System.out.println("Student got Grade:  A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Student got Grade:  B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Student got Grade:  C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Student got Grade:  D");
        } else {
            System.out.println("Student Failed");
        }
    }
}
