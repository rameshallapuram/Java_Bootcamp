package LinearSearch;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Ramesh";
        name = name.toLowerCase();
        System.out.print("Enter the letter to search: ");
        char target = sc.next().charAt(0);
        search(name, target);

    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i =0; i<str.length(); i++){
            if(target == str.charAt(i)){
                System.out.println("letter present at "+i+" index");
                return true;
            }
        }
        System.out.println("Letter not present.");
        return false;
    }
}
