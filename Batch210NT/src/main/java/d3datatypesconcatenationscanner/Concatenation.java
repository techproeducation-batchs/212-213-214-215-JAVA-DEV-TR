package d3datatypesconcatenationscanner;

public class Concatenation {
    public static void main(String[] args) {
        //ornek : Bir String ve iki int variable olusturun. string degeri ile int'lerin toplamini
        //console'a yazdiriniz.

        //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa "concatenation" islemi olur
        //"concatenation" islemi birlestirme yapar
        //Not: Contanetion islemlerinde java matematikteki islem onceligini kullanir

        String s = "elma";
        int a = 10;
        int b = 11;

        System.out.println(s + a + b); //elma1011
        System.out.println(s + (a + b)); //elma21
        System.out.println(s + a * b); //elma110
        System.out.println(a + b + s); //21elma

    }
}
