package src.main;

import java.net.InetAddress;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Tree set so that it is sorted, we can easily find median in the end.
        Set<Long> tree_Set = new TreeSet<Long>();
        System.out.println("\nEnter the host address to ping, type quit to exit:");
        String addr = sc.nextLine();
        //do following untill user quits
        while(!addr.equals("quit")) {
            try {
                InetAddress inet = InetAddress.getByName(addr);
                System.out.println("Pinging host "+addr+" 15 times and finding the median");
                for (int i=0;i<15;i++) {
                    long diffTime = System.currentTimeMillis();
                    //pinging the hosts
                    boolean isPinged = inet.isReachable(2000);
                    diffTime = System.currentTimeMillis() - diffTime;
                    if(isPinged) {
                        System.out.println("pinged successfully in "+ diffTime+ " millisecond");
                        tree_Set.add(diffTime);
                    }
                    else {
                        System.out.println("cannot reach host " + addr);
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception:" + e.getMessage());
            }
            //If pings were successful finding median (middle element)
            if(!tree_Set.isEmpty())
                System.out.println("Median of the ping time is: " + tree_Set.toArray()[8] + "\n");
            System.out.println("\nEnter the host address to ping, type quit to exit:");
            addr = sc.nextLine();
        }

    }
}

//139.130.4.5
