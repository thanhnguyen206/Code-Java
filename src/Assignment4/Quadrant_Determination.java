package Assignment4;

import java.util.Scanner;

public class Quadrant_Determination {

    public static void determineQuadrant(double x, double y) {
        if (x > 0 && y > 0) {
            System.out.println("diem (" + x + ", " + y + ") nam o goc phan tu thu 1.");
        } else if (x < 0 && y > 0) {
            System.out.println("diem (" + x + ", " + y + ") nam o goc phan tu thu 2.");
        } else if (x < 0 && y < 0) {
            System.out.println("diem (" + x + ", " + y + ") nam o goc phan tu thu 3.");
        } else if (x > 0 && y < 0) {
            System.out.println("diem (" + x + ", " + y + ") nam o goc phan tu thu 4.");
        } else {
            System.out.println("diem (" + x + ", " + y + ") nam tren 1 truc toa do.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap to do x: ");
        double x = scanner.nextDouble();

        System.out.print("nhap to do y: ");
        double y = scanner.nextDouble();

        determineQuadrant(x, y);

        scanner.close();
    }
}
