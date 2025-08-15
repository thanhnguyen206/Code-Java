package LEC3_EXERCISE;
import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first float number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second float number: ");
        double num2 = scanner.nextDouble();
        double average = (num1 + num2) / 2.0;
        System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
    }
}
