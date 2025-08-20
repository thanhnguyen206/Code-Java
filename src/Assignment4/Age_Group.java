package Assignment4;

import java.util.Scanner;

public class Age_Group {

    public static void kiemtra(int x) {
        if (0 < x && x < 12) {
            System.out.println(" ban la tre em");
        }
        if (13 < x && x < 19) {
            System.out.println(" ban la thieu nien");
        }
        if (20 < x && x < 59) {
            System.out.println(" ban la nguoi lon");
        }
        if (60 < x) {
            System.out.println(" ban la nguoi cao tuoi");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao so tuoi cua ban");
        int x = scanner.nextInt();
        kiemtra(x);
    }
}
