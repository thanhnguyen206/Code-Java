package Assignment4;

import java.util.Scanner;

public class TriangleClassifier {

    public static void classifyTriangle(double side1, double side2, double side3) {
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Day la mot tam giac deu.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Day la mot tam giac can.");
            } else {
                System.out.println("Day la mot tam giac thuong (scalene).");
            }
        } else {
            System.out.println("Ba canh nay khong the tao thanh mot tam giac.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap do dai canh thu nhat: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhap do dai canh thu hai: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhap do dai canh thu ba: ");
        double side3 = scanner.nextDouble();

        classifyTriangle(side1, side2, side3);

        scanner.close();
    }
}
