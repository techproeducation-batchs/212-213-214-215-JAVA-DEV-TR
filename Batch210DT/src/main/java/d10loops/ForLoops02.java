package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {

        /*Ornek 1: Verilen bir String’de ilk ‘a’ harfinden onceki tum character’leri console’a yazdiriniz.
        ==> “Tramvay”==> “Tr”
        */

        //break; bir donguyu erken bir sekilde sonlandirmak icin kullanilir
        String s = "Tramvay";

        for (int i = 0; i < s.length(); i++) { // i <= s.length() - 1 de olabilirdi
            char ch = s.charAt(i);

            if (ch == 'a'){
                break;
            }
            System.out.print(ch);
        }
        //-----------------
        //Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz
        //"Pwd12?Ab" ==> P12?A
        //continue; artirmaya azatmaya goturur. Altindaki kodlara devam ettirmez

        System.out.println("---------------");

        String s1 = "Pwd12?Ab";
        for (int i = 0; i < s1.length();                    i++) {
            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                continue;
            }else {
                System.out.print(ch); //P12?A
            }
        }
        System.out.println("---------------");
        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz. Meshur bir interview sorusu
        //           String t = “Ali Can”;  ==> "naC ilA"
        //son index her zaman length() - 1

        String t = "Java";
        String ters = ""; //ters cevrilmis yeni datayi burada saklayacagiz

        for (int i = t.length()-1; i >= 0 ;                                 i--) {
            ters = ters + t.charAt(i); //ters = ters + t.substring(i, i+1); da calisir
        }
        System.out.println(ters); //naC ilA

    }
}
