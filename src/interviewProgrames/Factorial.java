package interviewProgrames;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scannar = new Scanner(System.in);
        System.out.println("Enter a number");
        int scanner = scannar.nextInt();
        int fact=1, i;
        // Logic for Factorial
        for (i=scanner; i>=1; i--){
            fact = fact*i;

        }
        System.out.println("Factorial of given Number is :" + fact);

        }
    }


