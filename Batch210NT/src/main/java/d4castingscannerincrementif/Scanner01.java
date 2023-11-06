package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Java'da Scanner class, kullanicidan veya farkli bir kaynaktan girdi almanin kolay bir yoludur
        //Scanner sinifi, farkli veri tiplerini (int, String, float v.b.) kolaylikla okuyabilir
        //Bircok methodu vardir.

        //1.adim : Scanner class'tan object olustur
        Scanner giris = new Scanner(System.in);
        //System.in standart giris (klavye) uzerinden veri okumak icin kullanilir
        //Scanner bunu parametre olarak alir

        //2.adim : Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi  giriniz");

        //3.adim : Uygun methodu kullanarak kullanicinin verdigi data'yi
        //memory'e yerlestiriniz.

        byte age = giris.nextByte();

        System.out.println(age);


    }
}
