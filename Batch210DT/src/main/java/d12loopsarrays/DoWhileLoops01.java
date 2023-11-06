package d12loopsarrays;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdiriniz

        int i = 5;

        do {
            System.out.println(i);
            i--;
        }while (i > 2);

        //-----------------
        //while loop ile do while loop'un farki nedir?

        //Alttaki kodda while dongusune giremez cunku sart saglanmiyor.while dongusunde loop'un basta kirilmasi
        //mumkundur cunku once kural kontrol edilir sonra islem yapilir

        int k = 1;

        while (k < 1){
            System.out.println("ben while loop'um");
            k++;
        }
        //--------------
        //do while loop'ta loop'un en basta kirilmasi mumkun degildir. Once 1 kere calstirilir.
        int m = 1;

        do {
            System.out.println("Ben do while loop'um"); //Ben do while loop'um
            m++;
        }while (m < 1);




    }
}
