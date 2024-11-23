package strings;

public class Assigment9 {

    //Count and Skip Odd Numbers: Write a program that uses a for loop to count the number of odd numbers between 1 and 100.
    // Use continue to skip even numbers in your count.
    public static void main(String[] args) {


        int count = 0;
        for (int num = 1; num <= 100; num++) {
            // Skip even numbers
            if (num % 2 == 0) {
                continue;
            }
            count++;
//
            System.out.println(count);
            System.out.println(num);
        }
        }

    }
