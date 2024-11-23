package newobject;

import java.sql.SQLOutput;

public class DisplayStudentDetails {

    public static void main(String []args) {

        StudentDetails SD = new StudentDetails();
        System.out.println(SD.Name);
        System.out.println(SD.Roll_Number);
        System.out.println(SD.Grade);

//       System.out.println(SD.Name.equals(SD.Roll_Number));
       System.out.println("1. "+ SD.Name + ("  ") + SD.Roll_Number +("   ") + SD.Grade);
       System.out.println("2. "+ SD.Name1 + ("  ") + SD.Roll_Number1 +("   ") + SD.Grade1);
       System.out.println("3. "+ SD.Name2 + ("  ") + SD.Roll_Number2 +("   ") + SD.Grade2);


//       StudentGrades SG = new StudentGrades();
//       SG.StudentGrades();
//        String StudentGrades;
//        System.out.println(StudentGrades);
//        System.out.println ( Name4 [0]);
//    System.out.println( Roll_Number4[0]);
//      System.out.println( Grades4[0]);

    }
}
