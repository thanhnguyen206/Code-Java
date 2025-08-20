package Assignment4;
import java.util.Scanner;
public class Academic_Grading{
    public static void kiemtraDTB(double x){
        if(9.0<x&&x<10){
            System.out.println("Excellent");
        }
        if(8.0<x&&x<8.9){
            System.out.println("Good");
        }
        if(6.5<x&&x<7.9){
            System.out.println("Fair");
        }
        if(5.0<x&&x<6.4){
            System.out.println("Average");
        }
        if(x<5.0){
            System.out.println("Fail");
        }
    }
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap vao so diem trung binh cua ban");
        double x=scanner.nextDouble();
        kiemtraDTB(x);
    }
} 

