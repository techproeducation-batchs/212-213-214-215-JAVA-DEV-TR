package d4castingscannerincrementif;

public class Operators {
    public static void main(String[] args) {
        //Logical operators (lojik operatorler)

        //AND-VE (&&) isleminden true alabilmek icin her sey true olmalidir.(carpma)
        //OR-VEYA (||) isleminde bir tane true sonucu true yapmaya yeterlidir.
        //NOT-DEGIL (!) true olani false, false olani true yapar

        //!true = false
        //!false = true
        //!!true = true

        //Comparison (Karsilastirma) Operators
        //<, >, <=, >=, ==, !=
        //Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz

        boolean a = 3<5; //true
        boolean b = 2+3 != 5; //false
        boolean c = 2+3*5 >=19; //false

        System.out.println(a && b); //false
        System.out.println(a || b || c); //true


    }
}
