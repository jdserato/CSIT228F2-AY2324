package Threads;

import java.util.Scanner;

public class PasswordMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = sc.nextLine();
        int len = pass.length();
        StringBuilder atk = new StringBuilder();
        atk.append("a".repeat(len));
        int ctr = 0;
        while (!atk.toString().equals(pass)) {
            ctr++;
            int res[] = new int[len];
            int tmp = ctr;
            for (int i = len-1, j = 0; i >= 0; i--, j++) {
                res[j] = tmp / (int) Math.pow(26, i);
                tmp = tmp % (int) Math.pow(26, i);
            }
            atk = new StringBuilder();
            for (int i = 0; i < len; i++) {
                atk.append((char)('a'+res[i]));
            }
            System.out.println(atk);
        }
        System.out.println("YEY HACKERMAN");
    }
}
