package src.main;

import java.util.Scanner;

public class java2 {
    static boolean containAllAlphabets(String s){
        boolean[] arr = new boolean[26];
        for(char ch : s.toCharArray())
            if(Character.isAlphabetic(ch))
                arr[(int)ch - (int)'a'] = true;
        for(boolean b : arr)
            if(b==false)
                return false;
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter String to Check: ");
            String expression = scanner.nextLine();
            expression = expression.toLowerCase();
            if(expression.equals("exit"))
                break;
            System.out.println(containAllAlphabets(expression));
        }
    }
}