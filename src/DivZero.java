import java.util.InputMismatchException;
import java.util.Scanner;

public class DivZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        try {
            System.out.println("Quotient: " + (a / b));
        } catch (InputMismatchException e) {
            System.err.println("Scanner error");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("General Exception");
        } finally {
            System.out.println("Program DONE");
        }
    }
}