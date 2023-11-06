package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.
        //Scanner ve Random class'larindan Object uretelim

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //0 ile 100 arasinda rastgele bir sayi uretelim
        int rastgeleSayi = random.nextInt(101); //Odev: 20-100 arasinda sayi nasil uretilir?

        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim
        int denemeSayisi = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim
        int tahminEdilen;

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir degisken olusturduk
        boolean tahminDogrumu = false;

        //Oyunun baslangicini yapalim
        System.out.println("0 ile 100 arasi bir sayiyi tahmin etmeye calisin");

        //Dogru tahmin yapilincaya kadar donguyu devam ettirelim

        do {
            //Kullanicidan bir tahmin alalim.
            System.out.println("Tahmininizi yapiniz");
            tahminEdilen = scanner.nextInt();

            //Sayaci bir artiralim
            denemeSayisi++;

            //Tahmini kontrol edelim

            if (tahminEdilen < rastgeleSayi){
                System.out.println("Sayi daha buyuk"); //Sayi kullanicinin tahmininden buyukse ipucu verdik

            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("Sayi daha kucuk");  //Sayi kullanicinin tahmininden kucukse ipucu verdik

            }else {
                tahminDogrumu = true; //Dogru tahminde bulunulduysa degiskeni true olarak guncelledik
                System.out.println("Tebrikler, dogru tahmin!");
                System.out.println("Deneme sayisi: " + denemeSayisi);
            }

        }while (!tahminDogrumu);

        scanner.close(); //Iyi bir programlama pratigi olarak, actiginiz kaynaklari mumkunse kapatin.

    }
}
