package day4;

import java.sql.SQLOutput;

public class Except_Multipleof3 {
    public static void main(String[] args) {

        //Print Numbers Except Multiples of 3: Write a program to print numbers from 1 to 20, but skip numbers that are multiples of 3 using continue.

        for (int i = 1; i<=20; i++){
            if (i % 3 ==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
