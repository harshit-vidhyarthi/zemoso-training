package src.main;

import java.io.File;
import java.util.Scanner;

public class java1
{
    static void MatchFiles(File[] fileList,int ptr,int l, String pattern)
    {
        if(ptr == fileList.length) {
            return;
        }
        if(fileList[ptr].isFile() && fileList[ptr].getName().matches( pattern)) {
            System.out.println(fileList[ptr].getAbsolutePath());
        }
        else if(fileList[ptr].isDirectory()) {
            MatchFiles(fileList[ptr].listFiles(), 0, l + 1, pattern);
        }
        MatchFiles(fileList,++ptr, l, pattern);
    }

    // Driver Method
    public static void main(String[] args)
    {
        String location = "/home/zadmin/Courses/java-object-oriented-programming-and-design-video-course";
        File locationObj = new File(location);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the regular expresion, type quit to exit:");
        String pattern = sc.nextLine();
        while(!pattern.equals("quit")) {
            System.out.println("All Matched files are:");
            if(locationObj.exists() && locationObj.isDirectory()) {
                File fileList[] = locationObj.listFiles();
                MatchFiles(fileList,0,0, pattern);
            }
            System.out.println("\nEnter the regular expresion, type quit to exit:");
            pattern = sc.nextLine();
        }
    }
}
//(.*)Coh(.*)
//(.?)(.?)6(.*)