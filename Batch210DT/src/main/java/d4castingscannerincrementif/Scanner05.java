package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int num = input.nextInt();

        //java bir tamsayiyi baska bir tamsayiya bolunce sonuc yine tamsayi cikar
        //Java kusuratlari siler, yuvarlama yapmaz.

        int ilkIki = num / 1000;

        //5 basamakli bir sayinin birler basamagini almak icin 10'a, birler ve onlari almak icin
        //100'e boler sonrada kalani aliriz
        //% ==> modulus ==> iki parametreli calisir
        //1.yi 2.ye boler ve kalani verir. num'i 100'e boler ve kalani verir

        int sonIki = num%100;

        System.out.println(ilkIki + sonIki);

    }
}
