package Lec5_Loops;
import java.util.Scanner;
import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int number;
        do {
            System.out.print("Please enter your answer: ");
            number = scanner.nextInt();
            if (number > randomNumber) {
                System.out.println("Your number is higher than the secret number!");
            }else if (number < randomNumber) {
                System.out.println("Your number is lower than the secret number!");
            } else {
                System.out.println("Congratulations! You guessed correctly!");
            }
        } while (randomNumber != number);
    }
}
