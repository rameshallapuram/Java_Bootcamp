package LinearSearch;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,34,56,78,90,12,23,45};
        System.out.println("Guess a number: ");
        int target = sc.nextInt();
        boolean ans = linearSearch(arr, target);
        System.out.println(ans);
        }
    //search the element in the array
    public static boolean linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int i = 0; i<= arr.length-1; i++) {
            if (target == arr[i]) {
                System.out.println(i);
                return true;
            }
        }
        return false;
    }
}
