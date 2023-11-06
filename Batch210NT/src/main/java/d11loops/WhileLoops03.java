package d11loops;

public class WhileLoops03 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın. interview sorusu
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int k = 313;

        String m = String.valueOf(k); //"313"
        String reversed = "";

        int n = m.length()-1; // son index'i aldik, n'ye yukledik

        while (n >= 0){ //dongu son index'ten baslamis oldu. (n)
           reversed = reversed + m.charAt(n);

           //m'nin icindeki "312" nin "2" sini aldik
            n--;
        }
        System.out.println(reversed);

        if (m.equals(reversed)){
            System.out.println("Palindromdur");
        }else {
            System.out.println("Palindrom degildir");
        }

    }
}
