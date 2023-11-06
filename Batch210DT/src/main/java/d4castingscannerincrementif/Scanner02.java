package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*Ornek 1:
        Kullanıcıdan;
        i)Adini ve Soyadini
        ii)Yaşını
        iii)Boyunu
        iv)kilosunu
        v) medeni durumunu girmesini isteyin.

        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın*/

        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi Soyadinizi giriniz");
        String fullName = input.nextLine(); //nextLine() methodu birden fazla kelime girisine izin verir

        System.out.println("Yasinizi giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunuzu giriniz");
        float height = input.nextFloat();

        System.out.println("Kilonuzu giriniz");
        short weight = input.nextShort();

        System.out.println("Medeni durumunuzu giriniz");
        String maritalStatus = input.next(); //next() tek kelimeli String almak icin kullanilir.

        //Kullanici bilgilerini ekrana yazdiralim
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);

    }
}
