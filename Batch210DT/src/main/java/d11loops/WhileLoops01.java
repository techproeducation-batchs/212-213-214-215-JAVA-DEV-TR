package d11loops;

public class WhileLoops01 {
    public static void main(String[] args) {
        //--------------for
/*        for (baslangic degeri; loop calisma kurali; artirma/azaltma){
            //calisacak kodlar
        }*/

        //--------------while

        /*baslangic degeri
        while (loop calisma kurali) {
            //calisacak kodlar
            artirma/azaltma
        }*/

        //for dongusunde iterasyon (dongu) sayisi onceden net biliniyordur
        //while dongusunde bilinmiyordur.

        //-------------------------
        //Ornek 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz (3 ve 6 dahil)

        //1.yol: for dongusu
        for (int i = 3; i < 7; i++) {
            System.out.println(i);
        }

        //2.yol: while dongusu
        int i = 3;

        while (i < 7){
            System.out.println(i);

            i++;
        }
        //-----------------
        //Ornek 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz(12 dahil)
        System.out.println("---------------");
        int k = 23;

        while (k > 11){

            if (k % 2 == 0){
                System.out.println(k);
            }
            k--;
        }



    }
}
