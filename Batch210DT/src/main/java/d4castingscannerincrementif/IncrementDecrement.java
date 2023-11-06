package d4castingscannerincrementif;

public class IncrementDecrement {
    public static void main(String[] args) {
        //Bu ifadeler genellikle dongulerde kullanilir.

        //------------increment - artirma
        int a = 5;
        a = a + 2; //a iki defa yazilmis.Tekrardan kurtulalim
        System.out.println(a);
        a += 2; //a = a + 2; nin aynisidir
        System.out.println(a); //9

        //--------------decrement - azaltma
        int c = 10;
        c = c - 3;
        System.out.println(c); //7
        c -= 4; // c = c - 4; un aynisidir
        System.out.println(c); //3

        //--------------carpma
        int d = 6;
        d = d * 2;
        System.out.println(d); //12
        d *= 2; // d = d * 2'nin aynisidir
        System.out.println(d); //24

        //--------------bolme
        int e = 24;
        e = e / 2;
        System.out.println(e); //12
        e /= 2;
        System.out.println(e); //6

    }
}
