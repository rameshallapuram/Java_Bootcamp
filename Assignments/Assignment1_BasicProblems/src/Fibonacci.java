package Assignments.Assignment1_BasicProblems.src;//To calculate Fibonacci Series up to n numbers.

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i,  n = 10;
        System.out.print(n1+ " " + n2); //printing 0 and 1

        for (i = 2; i < n; i++) //starting the loop from 2nd index
        {
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
