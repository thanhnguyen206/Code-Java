package Opp_nguoi;

import java.util.ArrayList;

public class Danhsachnguoi {

    private ArrayList<Nguoi> danhSach;

    public Danhsachnguoi() {
        this.danhSach = new ArrayList<>();
    }

    public void themDanhSach(Nguoi nguoi) {
        nguoi.nhap();
        this.danhSach.add(nguoi);
        System.out.println("Da them thanh cong mot doi tuong vao danh sach.");
    }

    public void xuatDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }
        System.out.println("--- DANH SACH NGUOI ---");
        for (Nguoi nguoi : danhSach) {
            System.out.println("--------------------");
            nguoi.xuat();
            System.out.println("--------------------");
        }
    }
}

