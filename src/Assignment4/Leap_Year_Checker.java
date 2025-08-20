package Assignment4;

import java.util.Scanner;

public class Leap_Year_Checker{
    public static void kiemtranam(int x){
        if(x%4==0&&x%100!=0||x%400==0)
        {
            System.out.println(x+ " nam nay la nam nhuan");
        }
        else{
            System.out.println(x+ " khong phai la nam nhuan");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" nhap vao so nam");
        int x=scanner.nextInt();
        kiemtranam(x);

    }

}
