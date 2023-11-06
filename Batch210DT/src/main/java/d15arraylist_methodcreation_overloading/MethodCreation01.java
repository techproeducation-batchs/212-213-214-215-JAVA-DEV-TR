package d15arraylist_methodcreation_overloading;

public class MethodCreation01 {

    public static void main(String[] args) {



        /*Java da Method Olusturma: Java’da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.

        Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir
        ve bu iç class’in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde
        geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz.

        Java'da method main method'un disinda ama class'in icinde olusturulur.
        Access modifier + Static (optional) + return type + Method ismi () {} seklinde olusturulur
        Olusturulan method main icinden cagirilmalidir. Buna method call denir
        */

        int sonuc = toplama(3,5); //main icinde bir methodu cagirdik. Cagirma isleminde kullanilan
        //toplama(3,5); kodunun 2 gorevi vardir. 1- methodu cagirmak 2- return degerini icinde tutmak
        System.out.println(sonuc); //8

    } //main method kapanisi

    //ornek 1: toplama islemi yapan bir method olusturunuz

    public static int toplama(int a, int b){
        return a + b; //return, cagirildigi yere sonucu dondurur
    }


}
