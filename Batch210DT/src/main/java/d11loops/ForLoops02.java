package d11loops;

import java.util.Scanner;

public class ForLoops02 {
    public static void main(String[] args) {
        //nested for - icice for'lar

        /*
        ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....    */

        /*for (int i = 1; i < 5; i++) {
            System.out.println("Week:" + i);

            System.out.println("    Day: 1");
            System.out.println("    Day: 2");
            System.out.println("    Day: 3");
            System.out.println("    Day: 4");
            System.out.println("    Day: 5");
            System.out.println("    Day: 6");
            System.out.println("    Day: 7");

        }*/
        //outer loop - dis dongu - i
        //inner loop - ic dongu - j
        for (int i = 1; i < 3;                                      i++) {
            System.out.println("Week:" + i);
            for (int j = 1; j < 3;                                  j++) {
                System.out.println("     Day: " + j);
            }
        }

        //-----------------------
        /* Ornek 2:
        Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz

              X X X X X
              X X X X X
              X X X X X    */
        System.out.println("--------------");
        Scanner input = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = input.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun ; j++) {
                System.out.print("X ");

            }
            System.out.println();
            //satirdaki X'ler print ile yazdirildigindan pointer'i alt satira gecirmek icin kullandik
        }

        //Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        /*

         *
         * *
         * * *
         * * * *

         */
    }
}
