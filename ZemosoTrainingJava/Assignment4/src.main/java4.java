package src.main;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class java4 {

    static String str, signUpDatestr, curDatestr;
    static Instant signUpDate, curDate, aniversaryDate;
    static int t;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of inputs");
        t = sc.nextInt();
        for(;t>0;t--) {
            signUpDatestr = sc.next();
            curDatestr = sc.nextLine();
            //signUpDate = Instant.parse(signUpDatestr);
            //curDate = Instant.parse(curDatestr);
            //System.out.println(signUpDate);
            //System.out.println(curDatestr);
            getDateRange(signUpDatestr, curDatestr);
        }
    }
    static int getDateRange(String signUpDatestr, String curDatestr) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false);
        Date signupDate=null, currentDate=null;
        try{
            signupDate = format.parse(signUpDatestr);
            currentDate = format.parse(curDatestr);
        }
        catch(Exception e){
            System.out.println("Invalid Date!");
            return 0;
        }
        if(signupDate.after(currentDate)){
            System.out.println("No range");
        }
        else{
            Calendar calSignup = GregorianCalendar.getInstance();
            calSignup.setTime(signupDate);
            Calendar calCurrent = GregorianCalendar.getInstance();
            calCurrent.setTime(currentDate);
            int years = calCurrent.get(Calendar.YEAR) - calSignup.get(Calendar.YEAR);
            calSignup.add(GregorianCalendar.YEAR, years);
            calSignup.add(GregorianCalendar.DAY_OF_MONTH, -30);
            System.out.print(format.format(calSignup.getTime()) + " ");
            calSignup.add(GregorianCalendar.DAY_OF_MONTH, 60);
            if(calSignup.before(calCurrent)){
                System.out.println(format.format(calSignup.getTime()));
            }
            else{
                System.out.println(format.format(calCurrent.getTime()));
            }
        }
        return 0;
    }

}

