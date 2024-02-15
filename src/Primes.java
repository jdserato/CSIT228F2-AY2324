import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        int ctr = 0;
        for (int i = 1; i<= n; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                ctr++;
//                System.out.println(i+" is prime!");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total prime numbers: " + ctr);
        System.out.println("Total time: " + (endTime-startTime));
    }
}
