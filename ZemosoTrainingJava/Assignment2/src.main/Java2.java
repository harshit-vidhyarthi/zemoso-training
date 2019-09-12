package src.main;

import java.util.Scanner;

/* **
Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution as comments in the source file.
 */
public class Java2 {
    //function to find whether all a-z alphabets are present
    static boolean containAllAlphabets(String s){
        //boolean array to mark the presence of 26 alphabets
        boolean[] arr = new boolean[26];
        for(char ch : s.toCharArray())
            if(Character.isAlphabetic(ch))
                //mark as true if any character found
                arr[(int)ch - (int)'a'] = true;
        //return false if any character unmarked
        for(boolean b : arr)
            if(b==false)
                return false;
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter String to Check: ");
            //scanning input
            String expression = scanner.nextLine();
            expression = expression.toLowerCase();
            if(expression.equals("exit"))
                break;
            //calling function to get required answer
            System.out.println(containAllAlphabets(expression));
        }
    }
}

/* **
Time complexity - O(N)
Space Complexity - O(N)
Note: N is the size of input string
 */