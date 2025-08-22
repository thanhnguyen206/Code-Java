
package Lec5_Loops;
import java.util.Scanner;
public class CalculateFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do{
            System.out.print("Enter Number >= 0: ");
            N = scanner.nextInt();
            if (N < 0) {
            System.out.println("Please enter a non-negative number!");
            }
        }while(N <0);
        
        long factorial = 1;
        for (int i = N; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("The factorial of 5 is: "+ factorial);

        scanner.close();
    }
}