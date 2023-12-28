package oop_concepts.inheritance.withInheritance;

public class Main {

    public static void main(String[] args) {

        Teacher teacher=new Teacher();
        teacher.name="Akif";
        teacher.surname="Can";
        teacher.username="MathTeacher";
        teacher.phone="12345678";
        teacher.lesson="Math";

        teacher.displayLessons();//teacher

        Student student=new Student();
        student.name="Ali";
        student.surname="Berk";
        student.studentNumber="123";

        student.displayLessons();//user


    }

}
