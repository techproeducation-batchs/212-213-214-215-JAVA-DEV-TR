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

        System.out.println("Adinizi ve Soyadinizi giriniz");
        String fullname = input.nextLine(); //nextLine(); methodu ile birden fazla kelime girdisi alabilirsiniz

        System.out.println("Yasinizi giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunuzu giriniz");
        float height = input.nextFloat();

        System.out.println("Kilonuzu giriniz");
        short weight = input.nextShort();

        System.out.println("medeni durumunuzu giriniz");
        String maritalStatus = input.next(); //Kullanicidan tek kelimelik String aldik

        System.out.println("fullname = " + fullname);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);


    }
}
