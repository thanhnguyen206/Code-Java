package Assignment4;
import java.util.Scanner;
public class Even_or_Odd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao 1 so bat ki ");
        int x=scanner.nextInt();
        if(x%2==0){
            System.out.println(x+" la 1 so chan ");
        }else{
            System.out.println(x+" la 1 so le ");
        }
        
    }
}
