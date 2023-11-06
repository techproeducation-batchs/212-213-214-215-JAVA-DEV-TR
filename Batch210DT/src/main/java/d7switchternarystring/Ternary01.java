package d7switchternarystring;

public class Ternary01 {
    public static void main(String[] args) {
        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.

        //-4 ==> -1*-4, 4 ==> 4, 0 ==> 0

        //(c) ? (t) : (f)

        int c = 2;

        int result = c < 0 ? -1 * c : c;

        System.out.println(result);

        //---------------------
        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // "Farkli isaretli sayilari carpamiyorum” mesaji veren kodu yaziniz.

        int a = -7;
        int b = -4;

        //(c) ? (t) : (f)

        Object sonuc = (a > 0 && b > 0) || (a < 0 && b < 0) ? a*b : "Farkli isaretli sayilari carpamiyorum";

        System.out.println(sonuc);

    }
}
