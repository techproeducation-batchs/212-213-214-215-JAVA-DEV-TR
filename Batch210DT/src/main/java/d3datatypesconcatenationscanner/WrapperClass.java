package d3datatypesconcatenationscanner;

public class WrapperClass {
    public static void main(String[] args) {
        //Java primitive data tiplerine yeni ozellikler(methodlar) ekleyerek yeni bir yapi olusturdu.
        //Bu yapiya wrapper (sarmalayici) class denir. En onemlisi girdigimiz veriler uzerinde method
        //kullaniminin yolu acilmis olur. Wrapper class'lar non primitivedir.

        //primitive     : char      - boolean - byte - short - int     - long - float - double
        //wrapper class : Character - Boolean - Byte - Short - Integer - Long - Float - Double

        int i = 12;
        //i. yazinca method acilmaz

        Integer k = 12;
        //k. yazinca methodlar acilir. Burasi class sinifindadir

        //---------------------------
        //Java'da primitive ve wrapper class'lari arasinda otomatik donusum yapabilen autoboxing ve
        //unboxing mekanizmalari vardir.autoboxing. primitive'i wrapper'a cevirir. Ornegin int'i
        //Integer'a cevirir. Unboxing ise tam tersi bir islem yapar, Integer'i int'e donusturur.

        //unboxing
        //Aritmetik islemler. Wrapper class'la aritmetik islem yapilirken Java otomatik olarak unboxing
        //yapar ki performans artsin

        //autoboxing
        //primitive veri turlerinin otomatik olarak esdeger wrapper class'lara donusturulmesidir

        //Ornek 1: primitive int'i wrapper Integer'a ceviriniz (Autoboxing)

        int num = 13;

        Integer wrapperNum = num;

        //Ornek 2: Wrapper Byte'i primitive byte'a ceviriniz (unboxing)

        Byte s = 19;

        byte primitiveS = s;


    }
}
