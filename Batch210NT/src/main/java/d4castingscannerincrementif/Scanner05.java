package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen bes basamakli bir sayi giriniz");
        int num = input.nextInt();

        //Java'da bir tamsayiyi baska bir tamsayiya bolunce sonuc tamsayi cikar
        //Java kusuratlari siler, yuvarlama yapmaz.

        int ilkIki = num / 1000;

        //% ==> modulus ==> kalani almak icin kullanilir.
        //Iki parametreli calisir.
        //1.parametreyi 2.ye boler ve kalani verir

        int sonIki = num%100;

        System.out.println(ilkIki + sonIki);

    }
}
