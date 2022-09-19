package Assignments.Assignment2;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt(), i = 1;
        //for loop

//        for (int i = 1; i <= num; i++) {
//            if(num%i==0){
//                System.out.print(i+" ");
//            }
//        }
        //while loop
//        while(i< num) {
//            if (num%i==0){
//                System.out.print(i + " ");
//            }
//            i++;
//
//        }

        //do while
        do {
            if (num%i==0){
                System.out.print(i+" ");
            }
            i++;
        } while (i<num);
    }
}

