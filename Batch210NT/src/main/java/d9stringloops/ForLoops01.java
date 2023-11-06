package d9stringloops;

public class ForLoops01 {
    public static void main(String[] args) {
        /*Loop dongu demektir
        Loop'lar tekrar eden kodlama islerini kolaylastirmak icin kullanilir
        Tum kod parcalarini belirli bir kural dongusu icinde tekrarlamak icin kullanilir.

        1-for loop
        2-while loop
        3-do while loop
        4-for each loop

         */

        //1- for loop
        //for döngüsü, temel olarak bir kod blogunu belirli bir sayıda ve üst üste çalıştırmak için
        // kullanılan bir dongudur

        //Döngü başlangıcında kullanılan degiskene döngü içinde müdahale edilerek tekrar sayısı değiştirilebilir.

        // for döngüsü, yineleme(iteration) sayısı bilindiğinde belirli döngüler için kullanılır.

        //ornek 1: Console'a 4 kere "Hi!" yazdirin

        //1.yol: Tavsiye edilmez
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2.yol

/*        for (Baslangic Degeri ; Loop Calisma Kurali ; Artirma/Eksiltme){
            //Calisacak kodlar
        }*/
        System.out.println("--------------");
        //Baslangic Degeri ; Loop Calisma Kurali ; Artirma/Eksiltme


        for (int i = 1; i < 5; i++) {  //i <= 4
            System.out.println("Hi!");
        }

        //---------------
        //Ornek 2: 20(dahil) den 3(dahil) e kadar tum tamsayilari console'a yazdiriniz

        for (int i = 20; i > 2; i--) {
            System.out.println(i);
        }
        //---------------
        //Ornek 3: 3'den 20'ye kadar tum cift sayilari console'a yazdiriniz(3 ve 20 dahil)
        System.out.println("-------------");

        for (int i = 3; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //27'den 3'e kadar tum tek sayilari console'a yazdiriniz. (27 ve 3 dahil)
    }
}
