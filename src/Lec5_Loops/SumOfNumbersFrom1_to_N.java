package Lec5_Loops;

import java.util.Scanner;

public class SumOfNumbersFrom1_to_N {

    public static void sumofnumber(int n) {

        int sum = 0;
        if (n <= 0) {
            System.out.println("nhap vao 1 so nguyen duong.");
        } else {

            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Tong cac so tu 1 den " + n + " la: " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot so nguyen bat ki :");
        int n = scanner.nextInt();
        sumofnumber(n);

    }

}
