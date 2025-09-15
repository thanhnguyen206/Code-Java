package Lec10_AbstractClass.AllAbstractMethod;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Barks barks");
    }
}
