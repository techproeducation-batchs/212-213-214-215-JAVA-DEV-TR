package d15arraylist_methodcreation_overloading;

import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Bir List olusturmanin kisa yolu

        List<Integer> myList = Arrays.asList(1, 3, 4, 9, 7);

        //asList kullanarak kisa yoldan eleman eklemenin bazi handikaplari vardir. a
        //Arka planda Array gibi calismaya baslar.
        //List'in eleman sayisini degistiren methodlari kullanamazsiniz
        //ornegin remove(), add() kullanmazsiniz
        //ama set() veya size() hala kullanabilirsiniz

        //myList.remove(0); //CALISMAZ
        //myList.add(5); //CALISMAZ

        myList.set(0, 5);
        System.out.println(myList); //[5, 3, 4, 9, 7]
        System.out.println(myList.size()); //5

    }
}
