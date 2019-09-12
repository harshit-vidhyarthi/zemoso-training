package src.main;

import java.net.InetAddress;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Long> tree_Set = new TreeSet<Long>();
        System.out.println("\nEnter the host address to ping, type quit to exit:");
        String addr = sc.nextLine();
        while(!addr.equals("quit")) {
            try {
                InetAddress inet = InetAddress.getByName(addr);
                System.out.println("Pinging host "+addr+" 10 times and finding the median");
                for (int i=0;i<10;i++) {
                    long diffTime = System.currentTimeMillis();
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
            if(!tree_Set.isEmpty())
                System.out.println("Median of the ping time is: " + tree_Set.toArray()[4] + "\n");
            System.out.println("\nEnter the host address to ping, type quit to exit:");
            addr = sc.nextLine();
        }

    }
}

//139.130.4.5