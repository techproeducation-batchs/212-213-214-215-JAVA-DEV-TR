package oop_concepts.polimorphism;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);//new Animal(name)
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName()+" cik cik sesi çıkarır.");
    }

}
