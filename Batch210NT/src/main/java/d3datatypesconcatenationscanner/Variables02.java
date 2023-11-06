package d3datatypesconcatenationscanner;

public class Variables02 {
    public static void main(String[] args) {
        /*
        Non-primitive Data Types

        Not 1: Uretilen her bir class ayni zamanda bir "non-primitive" data type dir.
            Bu yuzden “non-primitive" data typelar sinirsiz sayidadir denilebilir.
        Not 2: Non-primitive data typelarin isimleri buyuk harf ile baslar
        Not 3: Non-primitive ler icin java memory’de buyuklugune gore degisen boyutlarda yer ayirir

         */

        //String Data Types (Class) : String data tipi, cumleler, kelimeler, semboller, rakamlar icerebilir

        //Ornek 1 : Ogrenci ismi icin bir variable olusturup deger olarak Ali Can atayiniz

        String ogrenciAdi = "Ali Can";

        int age = 7;

        //Soru : primitive ve non-primitive data type'lari arasindaki farklar nelerdir? (interview sorusu)

        /*
        1) "primitive" ler sadece bizim atadigimiz degeri icerir
        "non-primitive" ler bizim atadigimiz degeri ve methodlari icerir

        2) "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar

        3) "primitive" leri java uretmistir ve 8 tanedir
        "non-primitive" leri java ve developerlar uretebilir, sinirsiz sayidadir.

        4) "primitive" ler memory de data type larina gore sabit boyutta bellek kullanir
        "non-primitive" ler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler

         */

        //ornek 2 : Sehir ismi icin bir variable olusturun ve once "Ankara" sonrada "Izmir"
        //degerlerini atayip ekrana yazdirin.

        String cityName = "Ankara";
        System.out.println(cityName); //Ankara

        cityName = "Izmir";
        System.out.println(cityName); //Izmir

    }
}
