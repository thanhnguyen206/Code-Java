package Lec5_Loops;

import java.util.Scanner;

public class CalculateAverageUntil0isEntered {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int count = -1;
        int sum = 0;
        do {

            System.out.print("Enter Number(enter 0 to stop): ");
            number = scanner.nextInt();
            sum += number;
            count++;
        } while (number != 0);
        double avg = sum / count;
        System.out.println("The average is: " + avg);
    }
}
