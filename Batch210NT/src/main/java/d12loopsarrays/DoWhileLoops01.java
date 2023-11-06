package d12loopsarrays;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        //---------------while
        /*Baslangic degeri
        while (loop calisma kurali){
            //calisacak kodlar
            artirma/eksiltme
        }*/

        //--------------do while
        //Baslangic degeri
        /*do{
            //calisacak kodlar
            //artirma/eksiltme
        }while (loop calisma kurali);*/

        //do while dongusu, dongu blogundaki kodun en az bir kere calisacagindan emin olmak istedigimiz
        //zaman kullanilir.

        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdiriniz

        int i = 5;

        do {
            System.out.println(i);
            i--;
        }while (i > 2);

        //-----------------
        //while loop ile do while loop'un farki nedir?
        //while loop'ta loop'un en basta kirilmasi mumkundur cunku kural kontrol edilir sonra islem yapilir

        int k = 1;

        while (k < 1){
            System.out.println("Ben while loop'um");
            k++;
        }

        //-----------------
        //do while loop'ta loop'un en basta kirilmasi mumkun degildir. Once 1 kere calistirilir
        int m = 1;

        do {

            System.out.println("Ben do while loop'um"); //Ben do while loop'um
            m++;

        }while (m < 1);

    }
}
