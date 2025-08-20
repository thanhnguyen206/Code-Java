package Assignment4;

import java.util.Scanner;

public class Find_the_Maximum {

    public static void kiemtra(int number1, int number2, int number3) {
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println(number1 + "la so lon nhat");
            } else {
                System.out.println(number3 + "la so lon nhat");
            }
        } else {
            if (number2 > number3) {
                System.out.println(number2 + "la so lon nhat");
            } else {
                System.out.println(number3 + "la so lon nhat");
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so thu nhat");
        int number1 = scanner.nextInt();
        System.out.println("nhap vao so thu hai");
        int number2 = scanner.nextInt();
        System.out.println("nhap vao so thu ba");
        int number3 = scanner.nextInt();
        kiemtra(number1, number2, number3);
    }

}
