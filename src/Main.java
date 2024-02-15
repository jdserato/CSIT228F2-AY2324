import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cat> cats = new ArrayList<>();
        try {
            System.out.print("Cat's age: ");
            int age = sc.nextInt();
            Cat cat = new Cat(age);
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println("MANA");
        }
        System.out.println("After try");
    }

    public static void infinite(int num) {
        String str1, str2, str3;
        System.out.println(num);
        infinite(num+1);
    }
}
