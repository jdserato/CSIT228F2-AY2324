package Threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainThread {
    static ArrayList<Thread> threads = new ArrayList<>();
    static Integer totalprime = 0;
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Pila ka threads; ");
        int thrnum = sc.nextInt();
        int each = n/thrnum;
        for (int i = 0; i < thrnum; i ++) {
            Runnable r = new NamedRunnable("Vince",i,each*i+1,each*(i+1));
            threads.add(new Thread(r));
        }
        System.out.println("Before start: " + threads.get(0).isAlive());
        for (Thread t : threads) {
            t.start();
            System.out.println("Going to the next");
        }
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Total number of PRIME: " + totalprime);
    }
}
