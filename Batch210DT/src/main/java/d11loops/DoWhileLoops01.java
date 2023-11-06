package d11loops;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        //------------while

        /*baslangic degeri
            while(loop calisma kurali) {
            //calisacak kodlar
            artirma/eksiltme
            }
         */

        //------------do while
        /*

        baslangic degeri
        do{

            //calisacak kodlar
            artirma/eksiltme

        }while(loop calisma kurali);

         */

        //do-while dongusu, dongu blogundaki kodun en az bir kere calisacagindan emin olmak istediginiz
        //zaman kullanilir, cunku kosul kontrolu en alttadir.

        //------------------
        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdiriniz

        int i = 5;

        do {
            System.out.println(i);
            i--;
        }while (i > 2);




    }
}
