package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //Rastgele sayi uretimi icin bu class'tan object olusturduk

        //0 ile 100 arasinda rastgele bir sayi uretelim
        int rastgeleSayi = random.nextInt(101);

        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim
        int denemeSayisi = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim
        int tahminEdilen;

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin  bir boolean degisken olusturalim
        boolean tahminDogrumu = false;

        //Oyunun aciklamasini yazdiralim
        System.out.println("0 ile 100 arasinda bir sayiyi tahmin etmeye calisin");

        //Dogru tahmin yapilincaya kadar donguyu devam ettirelim.

        do {
            //kullanicidan bir tahmin alalim
            System.out.println("Tahmininizi yapiniz");
            tahminEdilen = scanner.nextInt();

            //Sayaci bir artiralim
            denemeSayisi++;

            if (tahminEdilen < rastgeleSayi) {
                System.out.println("Sayi daha buyuk"); //Sayi kullanicinin tahmininden daha buyukse ipucu veriyoruz
            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("Sayi daha kucuk"); //Sayi kullanicinin tahmininden daha kucukse ipucu veriyoruz
            } else {
                tahminDogrumu = true; //Dogru tahminde bulunulduysa boolean degiskeni true olara guncelledik
                System.out.println("Tebrikler, dogru tahmin");
                System.out.println("Deneme sayisi : " + denemeSayisi);
            }


        } while (!tahminDogrumu);

        scanner.close(); //iyi bir programlama pratigi olarak, acilan kaynaklar kapatilmalidir
        //scanner object'ini kapattik

    }
}
