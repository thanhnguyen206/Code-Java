package Opp_nguoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {

    private String hoVaTen;
    private Date ngaySinh;
    private String gioiTinh;
    private int cmnd;

    public Nguoi(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
    }

    public Nguoi() {
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void nhap() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap thong tin:");
            System.out.print("Ho va ten: ");
            setHoVaTen(scanner.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            System.out.print("Ngay sinh(dd/MM/YYYY): ");
            String ngaySinhString = scanner.nextLine();
            setNgaySinh(sdf.parse(ngaySinhString));
            System.out.print("Gioi tinh: ");
            setGioiTinh(scanner.nextLine());
            System.out.print("CMND: ");
            setCmnd(Integer.parseInt(scanner.nextLine()));
        } catch (ParseException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    public void xuat() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("hoVaTen=" + getHoVaTen() + ", ngaySinh="
                + sdf.format(getNgaySinh()) + ", gioiTinh=" + getGioiTinh() + ", cmnd=" + getCmnd());
    }
}
