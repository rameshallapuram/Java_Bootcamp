package BinarySearch;

import java.util.Scanner;

public class SmallestChar {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'l', 'n', 'p', 'u', 'w'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char letter = sc.next().charAt(0);
        char ans = SearchChar(arr, letter);
        System.out.println(ans);
    }

    static char SearchChar(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>arr[mid]){
                start = mid+1;
            } else if (target< arr[mid]) {
                end = mid -1;
            }
        }
        return arr[start% arr.length];
    }
}
