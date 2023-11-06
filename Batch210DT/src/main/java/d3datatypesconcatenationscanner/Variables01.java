package d3datatypesconcatenationscanner;

public class Variables01 {
    public static void main(String[] args) { //psvm yada main ile kisa yoldam main ,ethod olusturabilirsiniz
        //4-long data type:
        //Tam sayilar icindir. Hafizada 8 byte yer kaplar
        //-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.(kentilyon)

        //Not: Long olusturuken eger deger. int'in maksimum degerinden buyuk ise
        //sonuna "L" koymak zorundasiniz, yoksa "Integer number too large" hatasini alirsiniz

        //Ornek 1: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz ve
        //console'a yazdiriniz

        long hucreSayisi = 123456789012L;
        System.out.println(hucreSayisi); //123456789012

        //Ornek 2: Iki tane Long variable olusturun ve toplamlarini bir etiketle console'a yazdirin

        long c = 12, d = 13;
        System.out.println("Toplam : " + (c+d)); //Toplam : 25
        //Java sayilari otomatik int kabul etti ve 4 byte tasarruf etti

        //-------------------------

        //5- float data type : Hafizada 4 byte yer kaplar
        //Decimal - ondalikli sayilar icin kullanilir
        //Ozellikle fiyat degerleri icin kullanilir.

        //Not: Java ondalikli sayilari otomatik olarak double kabul eder.
        //float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz

        //Ornek 1: 2 tane float data tipinde variable olusturunuz ve bunlarin toplamini bir etiket ile
        //console'a yazdiriniz

        //----------1.yol:
        float corapFiyati = 12.99f;
        float gomlekFiyati = 25.99f;

        System.out.println("Toplam fiyat : " + (corapFiyati + gomlekFiyati));//Toplam fiyat : 38.98

        //-----------2.yol
        float corapFiyati2 = 12.99f, gomlekFiyati2 = 23.99f;
        System.out.println("Fiyat : " + (corapFiyati2 + gomlekFiyati2)); //Fiyat : 86.95

        //--------------------------
        //6- double data type:
        //double memory'de 8 byte yer kaplar. Daha hassas hesaplamalarda kullanilir.

        //ornek 1: Hucre agirligi icin bir variable olusturup console'a yazdiriniz

        double hucreAgirligi = 0.000000000000028;
        System.out.println(hucreAgirligi); //2.8E-14 ==> 2.8 carpi 10 uzeri -14

        //--------------------------
        //7- char data type:
        //Tek karakterler icin kullanilir. 2 byte'tir. Sayi, sembol, harf farketmez
        //Tek tirnak icine yazilir

        //ornek : char data tipinde ismi isminIlkHarfi olan bir variable olusturunuz ve icine
        //tek bir karakter yukleyiniz

        char isminIlkHarfi = 'S';
        System.out.println(isminIlkHarfi); //S

        //--------------------------
        //8- Boolean Data Type :
        //Sadece true(dogru) ve false(yanlis) olmak uzere 2 farkli deger alir.

        //Ornek : boolean data tipinde emekli misin? sorusu icin bir degisken olusturun ve false atayin

        boolean isRetired = false;
        System.out.println(isRetired); //false

        //--------------
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;

        System.out.println(b1 && b2); // true
        System.out.println(b2 || b3); // true
        System.out.println(b2 && b4); // false
        System.out.println(b3 || b4); // false

        //------------------------------
        //System.out.println(); ve System.out.print(); arasindaki fark nedir?

        //System.out.println(); ekrana bir sey yazdirdiktan sonra otomatik yeni satira gecer.
        //System.out.print(); ekrana yazdirir ama yeni satira gecmez

        System.out.print("Merhaba ");
        System.out.print("Dunya"); //Merhaba Dunya

    }
}
