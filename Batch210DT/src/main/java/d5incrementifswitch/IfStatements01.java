package d5incrementifswitch;

public class IfStatements01 {
    public static void main(String[] args) {
        /*
    IF Turkce'de EGER demektir. Statements ise hukum bildiren ifade anlamina gelir. Bazi kodlari bazi sartlara gore
    aktive edebilmek icin kullanilir

                if you work hard, you will succeed
     */
        if (3 < 5) {

            System.out.println("condition dogru if calisti"); //condition dogru if calisti

        }

        //------------------

        if (7 == 4 + 3) {
            System.out.println("condition dogru, if calisti"); //condition dogru, if calisti
        }

        //------------------
        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana "Rakam" yazdirin

        int num = 12;

        if (num > -1 && num < 10) {
            System.out.println("Rakam");
        }
        //------------------
        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.

        int n = 67;

        if (n > 99 && n < 1000) {

            System.out.println("Sayi uc basamaklidir");
        }

    }

}
