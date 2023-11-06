package d14arrays_arraylist;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list); //[23, 24, 12, 9, 3]

        //ArrayList'lerde indexOf() method'u, listenin icinde belirtilen ogenin ilk olusumunun konumunu dondurur
        //Girilen elamanin index'ini verir.

                            //[23, 24, 12, 9, 3]
        for (Integer w : list){

            if (w % 2 != 0){ //kalan 0 degilse tektir
                list.set(list.indexOf(w) ,11);
            }
        }
        System.out.println(list);




    }
}
