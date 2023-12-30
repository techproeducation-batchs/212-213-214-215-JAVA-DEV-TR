package generics.bounding;

import java.util.ArrayList;
import java.util.List;


//wildcard:joker, (?) bilinmeyen data tipi
public class GenericWithWildcard {

    public static void main(String[] args) {

        List<Integer> integerList=new ArrayList<>();
        List<Double> doubleList=new ArrayList<>();
        List<String> stringList=new ArrayList<>();
        List<Number> numberList=new ArrayList<>();
        List<Object> objectList=new ArrayList<>();

        System.out.println("----------------alttan sınırlama-------------------------");
        addElements(integerList);
        System.out.println(integerList);
       // addElements(doubleList);//alltan integer ile sınırladık
        addElements(numberList);
        System.out.println(numberList);
        addElements(objectList);

        System.out.println("----------------üstten sınırlama-------------------------");
        multiplyByTwo(integerList);
        multiplyByTwo(doubleList);
        multiplyByTwo(numberList);
       // multiplyByTwo(objectList);

        System.out.println("----------------sadece wildcard-------------------------");
        printElements(integerList);
        printElements(doubleList);
        printElements(numberList);
        printElements(stringList);
        printElements(objectList);

        System.out.println("---------------- List<Object> -------------------------");

        printObjectElements(objectList);
        //printObjectElements(numberList);








    }

    //kullanımda alttan sınırlama
    //listeye 1 den 10 a kadar değerler ekleyen metod
    //list integer,number,object olabilir
    //o halde data tipini integer ve parentları olarak alttan sınırlayalım.
    public static void addElements(List<? super Integer > list){

        for (int i=1;i<11;i++){
            list.add(i);
        }

    }

     //kullanımda üstten sınırlama
    public static void multiplyByTwo(List<? extends Number> list){

        list.stream().map(t->2*t.doubleValue()).forEach(t-> System.out.print(t+" "));

    }


    //wildcard:herhangi bir data tipi için de kullanılabilir
    //?:bilinmeyen data tipi
    //wildcard read-only:değişikliğe izin vermez
    //sadece data tipinden bağımsız metodlar kullanılabilir.
    // örn: size,remove
    public static void printElements(List<?> list){//List<T> benzer

//        list.add(12);
//        list.add("java");

        for (Object obj:list){
            System.out.print(obj+"  ");

        }

       // list.stream().forEach(t-> System.out.print(t+" "));

    }

//NOT:List<?> ile List<T> benzer fakat tamamen aynı DEĞİLDİR.



    //List<Object>
    public static void printObjectElements(List<Object> list){

       list.add(12);
       list.add("java");

        for (Object obj:list){
            System.out.print(obj+"  ");

        }

        // list.stream().forEach(t-> System.out.print(t+" "));

    }

    //List<Object>--->farklı data tipi
    //List<String>--->farklı data tipi






}
