package oop_concepts.polimorphism;
//uygulamada animal nesnesine ihtiyacımız yok.
//makesoundu buradaki gibi kullanan yok
//o halde makesoundun bodysine gereksiz kod yazmama gerk yok.
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //abstract method
    public abstract void makeSound();

//getter-setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
