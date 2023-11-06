package d6ifswitchternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        /*Ornek 1:Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici
        olduguna karar veren kodu yaziniz.
        Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/

        Scanner input = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gunIsmi = input.next();

        //equals() iki String'in birbirinin aynisi olup olmadigini kontrol eder.
        //equals() methodu true veya false return eder. boolean
        //equals() methodu buyuk kucuk harfe duyarlidir
        //equalsIgnoreCase() method'u buyuk kucuk harfe duyarsizdir

        boolean haftaSonu = gunIsmi.equalsIgnoreCase("Cumartesi") ||
                gunIsmi.equalsIgnoreCase("Pazar");
        boolean haftaIci = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");

        if (haftaSonu) {
            System.out.println("Hafta sonu");
        } else if (haftaIci) {
            System.out.println("Hafta ici");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }

    }
}
