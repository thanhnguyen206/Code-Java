package Opp_nguoi;

import java.util.Date;
import java.util.Scanner;

public class GiaoVien extends Nguoi {

    private String maGiaoVien;
    private String xepLoaiThiDua;

    public GiaoVien() {
        super();
    }

    public GiaoVien(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd, String maGiaoVien, String xepLoaiThiDua) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maGiaoVien = maGiaoVien;
        this.xepLoaiThiDua = xepLoaiThiDua;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getXepLoaiThiDua() {
        return xepLoaiThiDua;
    }

    public void setXepLoaiThiDua(String xepLoaiThiDua) {
        this.xepLoaiThiDua = xepLoaiThiDua;
    }

    public void xepLoaiThiDua() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Xep loai thi dua:");
        System.out.println("1. Loai A");
        System.out.println("2. Loai B");
        System.out.println("3. Loai C");
        System.out.print("Chon xep loai thi dua: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                this.xepLoaiThiDua = "Loai A";
                break;
            case 2:
                this.xepLoaiThiDua = "Loai B";
                break;
            case 3:
                this.xepLoaiThiDua = "Loai C";
                break;
            default:
                this.xepLoaiThiDua = "Khong xac dinh";
                System.out.println("Lua chon khong hop le.");
                break;
        }
    }
    public void nhapThongTin() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma giao vien: ");
        this.maGiaoVien = scanner.nextLine();
        xepLoaiThiDua();
    }

    public void xuatThongTin() {
        super.xuat();
        System.out.println("Ma giao vien: " + this.maGiaoVien);
        System.out.println("Xep loai thi dua: " + this.xepLoaiThiDua);
    }
}
