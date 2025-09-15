package Lec9_InheritanceAndPolymorphism.EX1;

public class Processor {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        System.out.println("Cat's ID: " + cat.catID + "\nMade in: " + cat.source);
        cat.catchMouse();

    }

}
