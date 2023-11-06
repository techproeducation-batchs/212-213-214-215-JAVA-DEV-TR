package d3datatypesconcatenationscanner;

public class Operators {
    public static void main(String[] args) {
        /*
        +,-,*,/ islemleri Java’da matematikte kullanildigi gibi kullanilir
        Not 1: Java’da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
        Not 2: Eger sonuc tamsayi degilse java sonucun ondalik kismini silerek onu int’e donusturur.
        Not 3: Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk
        data tipinde olur.
        */

        int paraMiktari = 25;
        int kisiSayisi = 10;
        System.out.println(paraMiktari / kisiSayisi); //2

        double ucretMiktari = 25;
        int ogrenciSayisi = 10;
        System.out.println(ucretMiktari / ogrenciSayisi); //2.5
        //Buyuklukten kasit, memory'de daha fazla bilgi saklayabilmektir

    }
}
