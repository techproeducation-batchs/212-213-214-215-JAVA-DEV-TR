package d10loops;

public class ForLoops01 {
    public static void main(String[] args) {
        //Ornek 1: 3'den 20'ye kadar tum cift sayilari console'a yazdiriniz(20 dahil)
        //1.yol
        for (int i = 3; i < 21;  i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //2.yol:
        System.out.println("-------------");
        for (int i = 4; i < 21; i+=2) {
            System.out.println(i);
        }

    }
}
