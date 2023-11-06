package d4castingscannerincrementif;

public class TypeCasting {
    public static void main(String[] args) {
        //Sayisal primitive data tiplerinin birbirine donusturulmesine Type Casting denir
        //byte - short - int - long - float - double

        //Not 1: Kucuk data tiplerinin buyuk data tiplerine cevrilmesini Java otomatik yapar.
        // Bu isleme AutoWidening (Otomatik Genisletme) denir.

        //byte -    short -     int -           long -      float -     double

        //Not 2: Buyuk data tiplerini kucuk data tiplerine cevirmek riskli bir istir.Veri kaybi olusabilir.
        //Java bu isi otomatik yapmaz. Bu islemi kod yazanlar yapar.
        //bu isleme Explicit Narrowing (Aciktan daraltma) denir.

        //ornek 1: byte data type'ini int data type'ina ceviriniz. (AutoWidening)

        byte age = 13;

        int ageInt = age;

        //Ornek 2: int data type'ini short data type'ina ceviriniz.(Explicit Narrowing)

        int weight = 313;

        short weightShort = (short) weight;


    }
}
