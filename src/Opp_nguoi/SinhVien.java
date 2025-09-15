package Opp_nguoi;

import java.util.Date;
import java.util.Scanner;

public class SinhVien extends Nguoi {

    private String maSinhVien;
    private String renLuyen;

    public SinhVien(String maSinhVien, String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maSinhVien = maSinhVien;
        this.renLuyen = renLuyen;
    }

    public SinhVien() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getRenLuyen() {
        return renLuyen;
    }

    public void setRenLuyen(String renLuyen) {
        this.renLuyen = renLuyen;
    }

    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma sinh vien: ");
        setMaSinhVien(scanner.nextLine());
        System.out.println("Ren Luyen: ");
        setRenLuyen(scanner.nextLine());

    }

    public void xuat() {
        super.xuat();
        System.out.println("maSinhVien= " + getMaSinhVien());
    }

    public void danhGiaRenLuyen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh gia ren luyen: \nChon 1-gioi, 2-kha, 3-trung binh, 4-yeu");
        int danhGia = Integer.parseInt(scanner.nextLine());
        switch (danhGia) {
            case 1:
                System.out.println("gioi");
                break;
            case 2:
                System.out.println("kha");
                break;
            case 3:
                System.out.println("trung binh");
                break;
            case 4:
                System.out.println("yeu");
                break;
            default:
                System.out.println("Chon sai!");
        }
    }
}
