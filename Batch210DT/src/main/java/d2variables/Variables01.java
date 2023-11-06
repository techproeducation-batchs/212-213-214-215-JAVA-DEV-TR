package d2variables;

public class Variables01 {
    public static void main(String[] args){
        //Java bu satiri okumaz. Kendimize veya baskasina aciklamadir
        /*
        Java Strongly type'dir, bu nedenle Java'daki her degisken(variable)
        belirli veri turu (data type) ile iliskilendirilecektir
         */

        //Siralama nasil olacakti?

        //Ornek 1: String data tipinde ismi selam olan bir variable olusturarak,
        //icine "Hello World" yukleyiniz

        //Data Type ==> Variable Name ==> Atama operatoru ==>    Data ==> Noktali virgul

          String             selam            =              "Hello World"   ;
          System.out.println(selam); //Hello World

        System.out.println("---------------");
        //Ornek 2: Tamsayi(int) data tipinde ismi age olan bir variable olusturunuz ve icine 15 yukleyip
        //console'a yazdiriniz

        int age = 25;
        System.out.println(age); //25
        //-----------------------
        /*
        Not 1: primitive data type'larini Java olusturmustur
        Not 2: primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
        Not 3: primitive data type'larina gore memory'de farkli farkli yer kaplarlar
         */
        //----------------------
        //1-byte data type
        //Tamsayilar icindir. Hafizada 1 byte (8 bit) yer kaplar
        //-128 den +127 e (dahil) tamsayi degerleri icin kullanilir

        //Ornek 1: byte data tipinde ogrenci yasi icin bir variable olusturun ve deger atayin

        byte ogrenciYasi = 15;
        System.out.println(ogrenciYasi); //15

        //----------------------
        //2- short data type
        //Tamsayilar icindir. hafizada 2 byte yer kaplar.
        //-32768 den +32767 e (dahil) tamsayi degerleri icin kullanilir

        //ornek : Site nufusu icin bir variable olusturun ve deger atayin

        short siteNufusu = 1200;
        System.out.println(siteNufusu); //1200  //siteNufusu.sout kisa yoluyla yazdirabilirsiniz

        //----------------------
        //3- int data type
        //Tamsayilar icindir. Hafizada 4 byte yer kaplar.
        //-2,147,483,648 ile 2,147,483,647 e (dahil) tamsayi degerleri icin kullanilir
        //label kullandigimizda console'a yazdirirken, yazdirilan veri hakkinda aciklama gorulur

        int ulkeNufusu = 80324543;
        //System.out.println("Ulke Nufusu : " + ulkeNufusu); //Ulke Nufusu : 80324543
        System.out.println("ulkeNufusu = " + ulkeNufusu); //ulkeNufusu = 80324543 //ulkeNufusu.soutv ile
                                                        //kisa yoldan etiket tanimladik

        //ornek 2: Iki tane int variable olusturun ve toplamlarini bir etiketle console'a yazdiriniz
        int a = 12, b = 13;
        //System.out.println(a+b); //25
        System.out.println("Toplam : " +(a+b)); //Toplam : 25
    }
}
