package Assignment2;
public class EX2_2 {
    public static void main(String[] args){
        int x= 1;
        int z= x - x-- - x++ + --x - x + x-- +x;
        System.out.println("x =" +x);
        System.out.println("z =" +z);
    }
}
