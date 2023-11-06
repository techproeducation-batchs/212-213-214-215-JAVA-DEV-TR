package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner class'i kullanicidan veya farkli kaynaktan girdi (input) almanin kolay bir yoludur
        //Cesitli veri tipleri girdisi (int, float) alabilirsiniz
        //Cesitli methodlari vardir

        //1.adim: Scanner class'tan object olusturun
        //java.lang kutuphanedir
        Scanner giris = new Scanner(System.in);
        //System.in standart giris (klavye) uzerinden veri okumak icin kullanilir.
        //Scanner bunu parametre olarak alir

        //2.adim: Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz");

        //3.adim : Uygun method kullanarak kullanicinin verdigi data'yi
        //memory'e yerlestiriniz
         byte age = giris.nextByte();

        System.out.println(age);


    }
}
