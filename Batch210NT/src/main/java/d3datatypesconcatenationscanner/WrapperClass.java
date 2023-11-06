package d3datatypesconcatenationscanner;

public class WrapperClass {
    public static void main(String[] args) {
        //Java primitive data tiplerine yeni ozellikler (method) ekeleyerek yeni bir yapi olusturdu
        //bu yapiya wrapper class (sarmalayici sinif) denir.
        //En onemlisi girdigimiz primitive veriler uzerinde method kullanimin yolunu acar.
        //Wrapper class'lar non-primitive'dir

        //primitive     : char      - boolean - byte - short - int     - long - flaot - double

        //wrapper class : Character - Boolean - Byte - Short - Integer - Long - Float - Double

        int i = 12;
        //i. yazinca method acilmaz

        Integer k = 12;
        //k.yazinca methodlar acilir. Burasi class ozelligindedir

        //unboxing, java'da otomatik olarak gerceklesir. Wrapper class'lardan primitive turlere donusumu
        //ifade eder.

        //ornegin aritmetik islemler ve performans ihtiyaci icin primitive'ler daha iyidir.

        //autoboxing, primitive veri turlerinin esdeger wrapper class'lara donusturulmesidir.
        //Java bu islemi de otomatik yapar.

        //ornek : primitive int'i wrapper Integer'a ceviriniz (Autoboxing)

        int num = 13;

        Integer wrapperNum = num;

        //ornek : Wrapper Byte'i primitive byte'a ceviriniz (unboxing)

        Byte s = 19;

        byte primitiveS = s;
    }
}
