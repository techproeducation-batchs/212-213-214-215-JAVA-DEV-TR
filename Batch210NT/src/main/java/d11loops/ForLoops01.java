package d11loops;

public class ForLoops01 {
    //ornek 1: 6'dan 10'a kadar tum int’lerin (Integer) toplamini console'a yazdiriniz
    //           6+7+8+9+10=40 ==> 40

    //ONEMLI: Bu tarz toplam sorularinda ilk hamleniz, memory'de toplami depolayabileceginiz bir alan olusturmaktir
    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 6; i < 11; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam); //40
        //-------------------------

        //ornek 2: 10'dan 7'e kadar tum int’lerin carpimini console'a yazdiriniz
        //           10x9x8x7 ==> 5040

        int carpim = 1;

        for (int i = 10; i > 6 ; i--) {
            carpim = carpim * i;
        }
        System.out.println(carpim); //5040

    }
}
