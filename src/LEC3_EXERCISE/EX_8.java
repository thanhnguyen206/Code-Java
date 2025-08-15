package LEC3_EXERCISE;
import java.util.Scanner;
public class EX_8 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter name");
        String name= scanner.nextLine();
        Scanner monkey = new Scanner(name);
        while (monkey.hasNext()){
            String kheckhec= monkey.next();
            System.out.println(kheckhec);
        }
        
    }
    
}
