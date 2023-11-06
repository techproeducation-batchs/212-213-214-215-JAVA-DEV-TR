package d10loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz. interview sorusu
        //           578 ==> 5+7+8=20 ==> Output 20 olmali

        //% (modulus) kullanarak 10' bolersek kalani en sagdaki basamak olur
        //iki int'i biribirine bolersek sonuc int cikar (tamsayi)
        //Java virgulden sonrasini siler, yuvarlama yapmaz

        int sum = 0;
        for (int i = 578; i > 0; i = i / 10) { // i/=10 de yazabilirdik

            sum = sum + i % 10;
        }
        System.out.println("sum = " + sum); //sum = 20

        //-------------------
        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz
        // Yusuf ==> Ysf

        String t = "Yusuf";
        String unique = "";

        for (int i = 0; i < t.length();                 i++) {
            char ch = t.charAt(i); //index verince bize harfi verecek
            if (t.indexOf(ch) == t.lastIndexOf(ch)) {

                unique = unique + ch;
            }
        }
        System.out.println("Tekrarsiz : " + unique); //Tekrarsiz : Ysf

    }
}
