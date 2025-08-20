package Assignment4; 

import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            
            System.out.println("Day la phuong trinh bac nhat.");
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phuong trinh co mot nghiem: x = " + x);
            }
        } else {
            
            double delta = (b * b) - (4 * a * c);

            
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
               
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + x);
            } else { // delta > 0
                
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + " va x2 = " + x2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giai phuong trinh ax^2 + bx + c = 0");
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();

        solveQuadraticEquation(a, b, c);

        scanner.close(); 
    }
}