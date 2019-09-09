package src.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class java9 {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("[A-Z].*\\.$");
        String s = "Hello world.";
        Matcher matcher = pattern.matcher(s);
        if(matcher.find())
            System.out.println(true);
        else
            System.out.println(false);

        s = "hello world.";
        matcher = pattern.matcher(s);
        if(matcher.find())
            System.out.println(true);
        else
            System.out.println(false);

        s = "Hello world";
        matcher = pattern.matcher(s);
        if(matcher.find())
            System.out.println(true);
        else
            System.out.println(false);

        s = "hello world";
        matcher = pattern.matcher(s);
        if(matcher.find())
            System.out.println(true);
        else
            System.out.println(false);
    }
}