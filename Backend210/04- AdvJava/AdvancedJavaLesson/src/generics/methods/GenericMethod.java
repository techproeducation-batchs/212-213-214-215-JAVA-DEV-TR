package generics.methods;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {

        Integer[] intArr={2,3,8,99,55};
        Double[] doubleArr={1.3,35.6,99.9,0.5};
        String[] stringArr={"Java","generics","hayatımızı","kolaylaştırır"};

        //-------------------overloading-------------------------------
        printArray(intArr);
        printArray(doubleArr);
        printArray(stringArr);

        //--------------------generic void metod------------------------------
        printArrayGeneric(intArr);
        printArrayGeneric(doubleArr);
        printArrayGeneric(stringArr);

        //--------------------generic return eden metod------------------------------
        Integer first1=getFirst(intArr);
        String first2=getFirst(stringArr);

        //-------------------çok paramlı generic metod----------------------------

        printArrayAndValue(intArr,12);
        printArrayAndValue(stringArr,35);



    }

    //arrayleri yazdırmak için metod tanımlayalım
    //farklı parametreler için:overload
    public static void printArray(Integer[] arr){

        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }

    public static void printArray(Double[] arr){

        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    public static void printArray(String[] arr){

        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }

    //keşke generic metodumuz olsa
    public static <T> void printArrayGeneric(T[] arr){


        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }

    //keşke generic metodumuz geriye generic tipte değer döndürebilirse
    public static <T> T getFirst(T[] arr){

        T first=arr[0];

        return first;
    }

    //birden fazla data tipini kullanan generic metod
    public static <S,U> void printArrayAndValue(S[] arr ,U value){

       // arr[0]=value;//-->farklı data tipleri olabilir.!!!

        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println("------- değer :"+value);

    }





}
