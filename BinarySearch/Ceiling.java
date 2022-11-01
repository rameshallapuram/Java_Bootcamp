package BinarySearch;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        System.out.print("Enter a number: ");
        int target = sc.nextInt();
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        if (target>arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                System.out.print("At index "+mid+" we have ");
                return arr[mid];
            }
        }
        System.out.print("At index "+start+" we have the ceiling ");
        return arr[start];
    }
}
