package d6ifswitchternary;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //nested = ic ice gecmis

        /*Ornek 1: Kullanicidan 0'dan kucuk deger giremiyecek sekilde verileri aldiktan sonra;

        Eger calisan kadin ise;
            60 yasindan buyukse "Emekli Olabilir “yazdirin

        Eger calisan erkek ise;
            65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz */
        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyetinizi giriniz");
        String gender = input.next(); // next() tek kelime alir

        System.out.println("Yasinizi giriniz");
        int age = input.nextInt();

        if (age < 0 ){
            System.out.println("Lutfen 0'dan kucuk yas girmeyiniz");
        } else if (gender.equalsIgnoreCase("Kadin")) {
            if (age > 60){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Calismali");
            }
        } else if (gender.equalsIgnoreCase("Erkek")) {
            if (age < 65){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Calismali");
            }
        }else {
            System.out.println("Sizin icin farkli bir tanimlama yapilmadi");
        }

    }
}
