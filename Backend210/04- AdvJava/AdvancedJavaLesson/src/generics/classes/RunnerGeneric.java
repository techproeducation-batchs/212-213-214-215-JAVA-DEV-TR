package generics.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class RunnerGeneric {
    public static void main(String[] args) {

        //generic yapılarda hangi data tipiyle çalışacağımıza sonradan(kullanırken) karar verebiliriz.
        //Java 7 ile birlikte sağ tarafta data tipini yazmaya gerek kalmadı.


        //2 farklı objemiz var:laptop,book
        GenericProduct<Integer> laptop=new GenericProduct<Integer>();
        laptop.setCode(123);

        GenericProduct<String> book=new GenericProduct<>();
        book.setCode("advjava");
       // book.setCode(123);


        String str=book.getCode();//1-Type Castinge gerek kalmadı.
       // String str2=laptop.getCode();//2-ClassCastException hata riski kalmadı.
                                     //tür güvenliği ihlalinde CTE verdi.

        Integer code= laptop.getCode();

        //---------------------------------------------

        ArrayList<String> arrayList=new ArrayList<>();//E:String
        arrayList.add("harika");
      //  arrayList.add(123);


        HashMap<String,Double> map=new HashMap<>();//K:String, V:Double
        map.put("Student1",99.0);


        //------------------------ÇOK PARAMETRELİ CLASS--------------------------------------

  GenericClassTwoParam<String,Integer> mymap=new GenericClassTwoParam<>("generic",100,"Jack");
  GenericClassTwoParam<Integer,Integer> mymap2=new GenericClassTwoParam<>(99,100,"Jack");






    }
}
