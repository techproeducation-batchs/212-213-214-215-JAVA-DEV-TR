package records3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentDTO student=new StudentDTO("Bob","Stone","123456");
        StudentDTO student2=new StudentDTO("Alice","Stone","123457");

        StudentRepository repo=new StudentRepository();
        repo.save(student);
        repo.save(student2);

        //tüm listeyi görelim
        System.out.println("..........tüm öğrenciler.....");

        repo.listAllStudents();


        //listede 1. indexdeki öğrenci noyu değiştirmek istiyoruz.

        List<StudentDTO> allstudents=repo.studentList;

        //yeni bir student2 oluşturalım
        StudentDTO newstudent2=new StudentDTO(allstudents.get(1).firstname(),allstudents.get(1).lastname(),"123987");

        //eski student2 yi listeden kaldıralım
        repo.delete(student2);

        //yeni student2 yi listeye ekleyelim
        repo.save(newstudent2);

        //tüm listeyi görelim
        System.out.println("..........güncelleme sonrası tüm öğrenciler.....");
        repo.listAllStudents();






    }
}
