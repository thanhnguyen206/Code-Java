package Assignment4;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number (integer or decimal): ");
        double number = scanner.nextDouble();

        double absoluteValue = (number >= 0) ? number : -number;

        System.out.println("The absolute value of " + number + " is " + absoluteValue);

        scanner.close();
    }
}
