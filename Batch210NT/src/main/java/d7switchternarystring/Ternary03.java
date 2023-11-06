package d7switchternarystring;

public class Ternary03 {
    public static void main(String[] args) {
        //Ornek 1:  Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz. interview sorusu
        /*
               1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
        */
        // (c) ? (t) : (f)
        //(c) ? ( (c) ? (t) : (f) ) : (  (c) ? (t) : (f)  )

        int year = 1800;

        String result = (year%100==0) ?

                ( (year%400==0) ? ("Leap Year") : ("Leap Year degil") ) :

                (  (year%4==0) ? ("Leap Year") : ("Leap Year degil")  );

        System.out.println(result);



    }
}
