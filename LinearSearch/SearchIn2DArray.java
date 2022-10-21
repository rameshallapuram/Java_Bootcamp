package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {24,56,78, 43},
                {57, 12, 34, 67, 89, 76},
                {34, 56,11, 46, 69, 34, 43}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();
        int [] ans = LinearSearch(arr, target);
        System.out.println("The number is at "+Arrays.toString(ans)); //prints array of the position
        //System.out.println(ans); // prints location id
    }
    static int[] LinearSearch(int[][] arr, int target){
        for(int row = 0; row< arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row] [col] == target){
                    return new int[]{row, col};
                }
            }
        }
        System.out.println("Number not present.");
        return new int[]{-1,-1};
    }
}
