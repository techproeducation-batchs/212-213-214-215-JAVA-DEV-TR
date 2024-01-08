package records3;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    List<StudentDTO> studentList=new ArrayList<>();


    //kaydetme
    public void save(StudentDTO student){
        studentList.add(student);
    }

    //silme
    public void delete(StudentDTO student){
        studentList.remove(student);
    }

    //tüm öğrenciler
    public void listAllStudents(){
        for (StudentDTO student:studentList){
            System.out.println(student);
        }
    }

}
