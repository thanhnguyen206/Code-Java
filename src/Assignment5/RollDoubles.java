
package Assignment5;
import java.util.*;
public class RollDoubles {
    public static void main(String[] args){
        Random random = new Random();
        int ranDomA ;
        int ranDomB;
        int count=0;
        do{
            ranDomA = random.nextInt(6) +1;
            ranDomB = random.nextInt(6) +1; 
            count++;
        }while (ranDomA != ranDomB);
        System.out.println("Repeat :" + count);
        System.out.println(ranDomA);
        System.out.println(ranDomB);
    }
}