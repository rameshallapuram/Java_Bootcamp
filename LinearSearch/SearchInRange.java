package LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,34,56,13,67,89,45, 89, 13, 15, 77, 99};
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();
        System.out.println(linearSearch(arr, target,3,7));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            System.out.println("Out of bound");
            return -1;
        }
        for(int i = start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        System.out.println("Number not present in the range.");
        return -1;
    }
}
