
package Lec11_Encapsulation.Person;
public class Person {
    public String name;
    private double weight;
    public void setWeight(double weight){
        if(this.weight<0)
            System.out.println("Weight can not negative");
        else
            this.weight=weight;
    }
    
}
