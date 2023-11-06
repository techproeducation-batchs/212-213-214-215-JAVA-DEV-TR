package d2variables;

public class Variables01 {
    public static void main(String[] args){
        //Java bu satiri okumaz. Kendimize veya baskasina aciklamadir

        /*
        Java dili strongly type'dir, bu nedenle Java'daki her degisken(variable)
        belirli veri turu (data type) ile iliskilendirilmelidir.
         */

       //Ornek 1: String data tipinde ismi selam olan bir variable olusturarak, icine
       //"Hello World" yukleyip console'a yazdiriniz.

        //Siralama nasil olacakti?
        // Data Type ==> Variable Name ==> Atama operatoru ==>     Data ==> Noktali virgul

          String           selam             =                 "Hello World.."     ;
          System.out.println(selam); //Hello World..

        System.out.println("-----------------");

        //Ornek 2: Tamsayi(int) data tipinde ismi age olan bir variable olusturunuz ve icine
        //15 yukleyerek console'a yazdiriniz.

        int age = 25;
        System.out.println(age); //25

        /*
        Not 1: primitive data type'larini Java olusturmustur
        Not 2: primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
        Not 3: primitive datalar data type;larina gore memory'de farkli farkli yer kaplarlar.
         */

        //1- byte data type:
        //Tam sayilar icindir. Hafizada 1 byte yer kaplarlar.

        //Ornek 1: byte data tipinde ogrenci yasi icin bir variable olusturun, deger atayarak console'a yazdirin

        byte ogrenciYasi = 15;
        System.out.println(ogrenciYasi); //15 //sout ile hizlica System.out.println(); yazdirabiliriz

        //2- short data type:
        //Tamsayilar icindir. Hafizada 2 byte yer kaplar.

        //Ornek 1: Site nufusu icin bir variable olusturun ve deger atayin

        short siteNufusu = 1200;
        System.out.println("Site Nufusu : " + siteNufusu); //Site Nufusu : 1200

        //3-int data type:
        //Tamsayilar icindir. Hafizada 4 byte yer kaplar
        //-2,147,483,648 ile 2,147,483,647 e (dahil) tamsayi degerleri icin kullanilir

        //ornek 1: Ulke nufusu icin bir variable olusturun ve bir label(etiketle) ekrana yazdiriniz

        int ulkeNufusu = 84123456;
        System.out.println("ulkeNufusu = " + ulkeNufusu); //ulkeNufusu.soutv ile kisayoldan yazdirabilirsiniz
        //ulkeNufusu = 84123456
    }

}
