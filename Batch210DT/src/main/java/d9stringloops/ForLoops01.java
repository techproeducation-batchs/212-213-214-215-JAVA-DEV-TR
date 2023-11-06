package d9stringloops;

import d15arraylist_methodcreation_overloading.ArrayList01;
import d15arraylist_methodcreation_overloading.MethodCreation02;

public class ForLoops01 {
    public static void main(String[] args) {


        /*loop - dongu demektir
        Donguler tekrar eden kodlama islerini kolaylastirmak icin kullanilir

        Java da;

        1-for loop
        2-while loop
        3-do while loop
        4-for each (Collection'larda)

        */

        //1-for loop
        //for dongusu, temel olarak bir kod blogunu belirli sayida ve ust uste calistirmak icin kullanilir
        //yineleme - iteration

        //ornek 1: Console'a 4 kere "Hi!" yazdirin
        //1.yol : Tavsiye edilmez

        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("---------------");
        //2.yol

     /*   for (Baslangic degeri ; Loop Calisma Kurali ; Artirma/Eksiltme){
            //Calisacak kodlar
        }*/

        //i degisken ismidir
        //  Baslangic degeri ; Loop Calisma Kurali ; Artirma/Eksiltme

        for (int i = 1; i < 5; i++) { //i<=4, i++ ile i = i + 1 aynidir

            System.out.println("Hi!...");
        }

        //-------------------
        //ornek 2: 20 (dahil) den 3 (dahil) e kadar tum tamsayilari console'a yazdiriniz.

        for (int i = 20; i > 2; i--) {
            System.out.println(i);
        }

        //--------------------
        //Ornek 3: 3'den 20'ye kadar tum cift sayilari console'a yazdiriniz(3 ve 20 dahil)

        System.out.println("--------------");
        for (int i = 3; i < 21;i++) {
            if (i % 2 == 0) {                       //i % 2 == 0 ile cift sayilari sectik
                System.out.println(i);
            }
        }

        /*System.out.println("--------------");
        for (int i = 4; i < 21; i+=2) {
            System.out.println(i);
        }*/

        //Odev: 28'den 4'e kadar tum tek sayilari console' a yazdiriniz (28 ve 4 dahil)
    }
}
