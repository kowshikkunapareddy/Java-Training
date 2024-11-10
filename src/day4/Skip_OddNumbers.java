package day4;

public class Skip_OddNumbers {
    public static void main(String[] args) {

        //Count and Skip Odd Numbers: Write a program that uses a for loop to count the number of odd numbers between 1 and 100.
        //Use continue to skip even numbers in your count
            int b=0;
        for (int i =1; i <=100; i++){
            if (i %2 !=0){
                b++;

            }
        }
        System.out.println("Total No.of OddNmbers" + b);
    }
}
