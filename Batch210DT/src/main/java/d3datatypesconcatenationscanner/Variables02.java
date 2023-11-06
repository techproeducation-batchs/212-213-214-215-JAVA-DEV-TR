package d3datatypesconcatenationscanner;

public class Variables02 {
    public static void main(String[] args) {
        /*
        Non-primitive Data Types
        Not 1: Uretilen her bir class ayni zamanda bir Non-primitive Data Types'dir.
        Not 2: Non-primitive Data Types'larin isimleri buyuk harf ile baslar.
        Not 3: Non-primitive'ler icin Java meory'de buyuklugune gore degisen boyutlarda yer ayirir
         */
        //String Data Tipi (Class): Cumleler, kelimler, semboller, rakamlar icerebilir

        //Ornek 1: Ogrenci ismi icin bir variable olusturup deger olarak Ali Can atayiniz.

        String ogrenciAdi = "Ali Can";
        //Non primitive'ler ayrica classtir ve class'larin aktif, pasif ozellileri vardir.
        //O yuzden memory'de 2 sey olur. 1- Deger atamasi, 2- Methodlar aktiflesir
        int age = 7;

        /*

        Soru: primitive ve non-primitive data type'lari arasindaki farklar nelerdir? (interview sorusu)

        1) "primitive" ler sadece bizim atadigimiz degeri icerir
        "non-primitive" ler bizim atadigimiz degeri ve methodlari icerir

        2) "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar

        3) "primitive" leri java uretmistir ve 8 tanedir
        "non-primitive" leri java ve developerlar uretebilir, sinirsiz sayidadir.

        4) "primitive" ler memory de data type larina gore sabit boyutta bellek kullanir
        "non-primitive" ler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler

         */

        //Ornek 2: Sehir ismi icin bir variable olusturun ve once Ankara sonrada Izmir degerlerini atayin

        String cityName = "Ankara";
        System.out.println(cityName); //Ankara

        cityName = "Izmir";
        System.out.println(cityName); //Izmir


    }
}
