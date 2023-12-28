package oop_concepts.polimorphism.withInterface;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    public void fill(){
        System.out.println("This method is specific for circle");
    }

}
