package Assignment4;

import java.util.Scanner;

public class Simple_Calculator {

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double sub(double number1, double number2) {
        return number1 - number2;
    }

    public static double mul(double number1, double number2) {
        return number1 * number2;
    }

    public static double div(double number1, double number2) {
        if (number2 == 0) {
            return Double.NaN;
        }
        return number1 / number2;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kq;
        System.out.println("nhap vao so thu nhat");
        double number1 = scanner.nextDouble();
        System.out.println("nhap vao so thu hai");
        double number2 = scanner.nextDouble();
        System.out.println("Chon cac phep tinh (+, -, *, /");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                kq = add(number1, number2);
                System.out.println(" ket qua" + number1 + "+" + number2 + "=" + kq
                );
                break;
            case '-':
                kq = add(number1, number2);
                System.out.println(" ket qua" + number1 + "-" + number2 + "=" + kq
                );
                break;
            case '*':
                kq = add(number1, number2);
                System.out.println(" ket qua" + number1 + "*" + number2 + "=" + kq
                );
                break;
            case '/':
                kq = add(number1, number2);
                System.out.println(" ket qua" + number1 + "/" + number2 + "=" + kq
                );
                break;
            default:
                System.out.println("loi toan tu k hop le");
                break;

        }
    }

}
