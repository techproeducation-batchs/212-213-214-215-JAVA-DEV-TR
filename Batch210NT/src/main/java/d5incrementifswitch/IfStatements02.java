package d5incrementifswitch;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        //1.yol:

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Cift Sayi");
        }

        if (num % 2 != 0) { //num % 2 == 1 seklinde de yazilabilir
            System.out.println("Tek sayi");
        }
        //----------------------
        //if else Statements
        //else - aksi halse, degilse demektir.
        //condition dogruysa (true) if blogu, condition yanlissa (false) else blogu calisir
        //if else 2 durumlu senaryolarda kullanilir
        //2.yol: Tavsiye edilir

        if (num % 2 == 0) {
            System.out.println("Sayi cifttir");
        } else {
            System.out.println("Sayi tektir");
        }

    }
}
