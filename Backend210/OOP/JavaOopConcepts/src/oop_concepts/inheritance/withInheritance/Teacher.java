package oop_concepts.inheritance.withInheritance;

public class Teacher extends User{

    public String lesson;

    @Override//opsiyonel-->method overriding
    public void displayLessons(){
        System.out.println("Öğretmenin tüm dersleri....");
    }

    public void displayLessons(String lesson){//method overloading
        System.out.println("Öğretmenin tüm dersleri....");
    }

}
