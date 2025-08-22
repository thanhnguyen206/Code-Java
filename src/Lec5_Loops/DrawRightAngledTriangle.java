package Lec5_Loops;

import java.util.Scanner;

public class DrawRightAngledTriangle {

    public static void drawRightAngledTriangle(int h) {
        if (h <= 0) {
            System.out.println("chieu cao phai la so nguyen duong.");
        } else {
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("vui long nhap chieu cao cua tam giac vuong: ");
        int h = scanner.nextInt();

        drawRightAngledTriangle(h);

        scanner.close();
    }
}
