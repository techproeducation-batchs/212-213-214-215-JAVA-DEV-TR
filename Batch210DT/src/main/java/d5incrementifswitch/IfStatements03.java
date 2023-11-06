package d5incrementifswitch;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Iki durumlu senaryolarda if else kullanilir
        //Daha fazla durumlu senaryolarda if - else if ... - else statements kullanilir

        /*if () {

        } else if () {

        } else {

        }*/

        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        if (num > 0) {

            System.out.println(num + " sifirdan buyuktur"); //5 sifirdan buyuktur

        } else if (num < 0) {

            System.out.println(num + " sifirdan kucuktur");

        } else {

            System.out.println(num + " noturdur");

        }

    }
}
