package Lec5_Loops;

import java.util.Scanner;

public class DrawRectangle {

    public static void drawRectangle(int height, int width) {
        if (height <= 0 || width <= 0) {
            System.out.println("chieu cao va chieu rong phai la so nguyen duong.");
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("vui long nhap chieu cao cua hinh chu nhat: ");
        int height = scanner.nextInt();

        System.out.print("vui long nhap chieu rong cua hinh chu nhat: ");
        int width = scanner.nextInt();

        drawRectangle(height, width);

        scanner.close();
    }
}
