package arrayOrCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOrCollection {
    public static void main(String[] args) {

        //default elemanlar: [0,0,0]
        int[] grades=new int[3];//En fazla 3 not
        int[] grades2={85,92,98,100};//En fazla 4 not

        //diziyi yazdırma
        System.out.println(Arrays.toString(grades));

        //sabit boyut
        grades[0]=85;
        grades[1]=92;
        grades[2]=98;
      //  grades[3]=100;//ArrayIndexOutOfBoundsException
      //  grades2[4]=100;//ArrayIndexOutOfBoundsException

        //diziden eleman kaldıramayız
        grades[2]=0;


        //dizi içinde 70 notu var mı?
        //for-->if


        //not ortalamasını hesaplama
        int total=0;
        for (int grade:grades){
            total+=grade;
        }
        double avg=total/grades.length;
        System.out.println(avg);

//-------------   List  ------------------------------------------

        List<Integer> stdGrades=new ArrayList<>();

        //eleman ekleme:dinamik boyut
        stdGrades.add(92);
        stdGrades.add(99);
        stdGrades.add(99);
        stdGrades.add(100);
        stdGrades.add(98);

        //eleman silme
        stdGrades.remove(Integer.valueOf(100));

        //elemanları yazdırma
        System.out.println(stdGrades);

        //notlar içinde 70 var mı?-->contains,replace,isEmpty vs gibi birçok metodu var
        System.out.println(stdGrades.contains(70));

        //not ortalamalarını hesaplama
        int totalGrades=stdGrades.stream().reduce(Math::addExact).get();
        double avgGrade=totalGrades/stdGrades.size();
        System.out.println(avgGrade);


    }
}
