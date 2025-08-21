
package Assignment5;
import java.util.Scanner;
public class PrimeNumberCheck {
    
    public static int CheckPrimeNumber(int n){
        for (int i=2; i*i < n; i++){
            if ( n % i == 0){
                return 0;
            }      
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to check prime number: ");
        int number = scanner.nextInt();
        int a=CheckPrimeNumber(number);
        if (a==0){
            System.out.println(number+" is not Prime Number");
        }else if(a==1){
            System.out.println(number+" is Prime Number");
        }else{
            System.out.println("Errol");
        }
        
    }
}