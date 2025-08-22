package Lec5_Loops;

import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int number) {

        System.out.println("\nbang cuu chuong cua " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("vui long nhap mot so nguyen tu 2 den 9: ");
            number = scanner.nextInt();

            if (number >= 2 && number <= 9) {
                break;
            } else {
                System.out.println("so ban nhap khong hop le. vui long thu lai.");
            }
        }

        printMultiplicationTable(number);

        scanner.close();
    }
}
