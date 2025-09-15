package Opp_nguoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Danhsachnguoi danhSach = new Danhsachnguoi();
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhap thong tin (Sinh Vien / Giao Vien)");
            System.out.println("2. Xuat danh sach");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Ban muon nhap cho doi tuong nao? (1-Sinh vien, 2-Giao vien): ");
                    int typeChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (typeChoice == 1) {
                        danhSach.themDanhSach(new SinhVien()); 
                    } else if (typeChoice == 2) {
                        danhSach.themDanhSach(new GiaoVien()); 
                    } else {
                        System.out.println("Lua chon khong hop le.");
                    }
                    break;
                case 2:
                    danhSach.xuatDanhSach(); 
                    break;
                case 0:
                    isRunning = false;
                    System.out.println("Chuong trinh ket thuc.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }

            if (isRunning && choice != 0) {
                System.out.print("Tiep tuc khong? (1-co, 0-khong): ");
                int continueChoice = scanner.nextInt();
                if (continueChoice == 0) {
                    isRunning = false;
                    System.out.println("Chuong trinh ket thuc.");
                }
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}

