package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner04 {

    //Ornek 4: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz

    //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar

    //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz");
        float shortSide = input.nextFloat();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz");
        float longSide = input.nextFloat();

        System.out.println("Alan : " + (shortSide * longSide));
        System.out.println("Cevre : " + (2*shortSide + 2*longSide));
    }

}