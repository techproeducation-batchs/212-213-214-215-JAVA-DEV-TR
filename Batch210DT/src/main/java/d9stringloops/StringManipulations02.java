package d9stringloops;

public class StringManipulations02 {
    public static void main(String[] args) {

        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1-Parola Boş olmamalıdır, en az bir karakter icermelidir.
        2-Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3-Başında ve sonunda boşluk olmamalıdır.*/

        //Not: empty sadece hicligi kontrol eder (true verir). ""
        //     blank ise hem hicligi hemde space'i kontrol eder(true verir) "", " "
        //--------------------
        //1- Parola Boş olmamalıdır, en az bir karakter icermelidir.
        String pwd = " a ";

        boolean first = pwd.isEmpty(); //bos mu? bossa true verecek
        //System.out.println(first);

        //2-Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı,
        // space harici karakterlerde bulunmalidir.

        boolean second = pwd.isBlank();
        //System.out.println(second);

        //3-Başında ve sonunda boşluk olmamalıdır.*/

        boolean third = pwd.trim().equals(pwd);
        //System.out.println(third);

        if (first) {
            System.out.println("Parola bos birakilamaz");
        }
        if (second) {
            System.out.println("Parola bos birakilmamali ve bosluk harici karakterlerde bulunmalidir");
        }
        if (!third) {
            System.out.println("Parolanin basinda yada sonunda bosluk birakilmamalidir");
        }

    }
}
