package generics.bounding;
//parametre olarak aldığımız data tipini üstten sınırlandırabiliriz.
//generic olan bu sınıfta parametre olarak sadece Number ve childları kullanılabilir.
//T:INTEGER,SHORT,LONG,DOUBLE,FLOAT,BYTE,NUMBER

public class GenericUpperBound<T extends Number> {

    public T[] numberArray;

    //param const

    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }


    //numberArray içindeki elemanların ortalamasını bulan metod
    public Double getAverage(){
        double sum=0;

        for (T t:this.numberArray){

            sum+=t.doubleValue();

        }

        double avg=sum/this.numberArray.length;

        return avg;

    }

    public static void main(String[] args) {

        Integer[] integers={5,6,9,8};
        Double[] doubles={1.2,3.5,8.7,9.9};
        String[] strings={"genericler","üstten","sınırlandırılabilir."};


        GenericUpperBound<Integer> obj=new GenericUpperBound<>(integers);
        System.out.println(obj.getAverage());

        GenericUpperBound<Double> obj2=new GenericUpperBound<>(doubles);
        System.out.println(obj2.getAverage());

//        GenericUpperBound<String> obj3=new GenericUpperBound<>(strings);
//        System.out.println(obj3.getAverage());


    }



}
