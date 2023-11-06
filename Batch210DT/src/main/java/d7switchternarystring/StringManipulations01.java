package d7switchternarystring;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String (Class) data tipi cumleler, kelimeler, semboller, rakamlar icerebilir.

        //Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz.
        //length() method'i String'in uzunlugunu dondurur

        String s = "Java is easy";

        int sLength = s.length();
        System.out.println(sLength); //12

        //------------------------
        //Ornek 2: "s" String'inde ilk ve son indexteki karakterleri aliniz.
        //charAt() metodu, belirtilen indexte yer alan karakteri dondurmek icin kullanilir.
        //index 0 tabanlidir, yani ilk karakterin indexi sifirdir.

        char firstChar = s.charAt(0);
        System.out.println(firstChar); //J

        char lastChar = s.charAt(11); //statik kod, hard code
        System.out.println(lastChar); //y

        char lastChar2 = s.charAt(s.length()-1); //dinamik kod
        System.out.println(lastChar2); //y

        //length()-1 her zaman son indexi verir

        //------------------------
        //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz.
        //substring(int beginIndex, int endIndex) methodu belirtilen index araligini dondurur
        //substring(0,4) ==> 0 yani ilk index dahil, 4 yani ikinci index harictir.

        //Java is easy

        String sub1 = s.substring(0,4);
        System.out.println(sub1); //Java

        //Ornek 4: "s" String'indeki "is" kelimesini aliniz.
        String sub2 = s.substring(5,7);
        System.out.println(sub2); //is

        //Ornek 5: "s" String'indeki “easy" kelimesini aliniz.
        String sub3 = s.substring(8,12);
        System.out.println(sub3); //easy

        //2.kullanimi: substring(int beginIndex): Belirtilen indexten baslayarak sonuna kadar olan String'i dondurur

        String sub4 = s.substring(8);
        System.out.println(sub4); //easy

        //Ornek 6: “s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
        //contains() method’u herhangi bir karakterin veya karakterlerin String'de var olup olmadigini kontrol eder.
        //contains() methodu true veya false return eder. boolean

        boolean isExist = s.contains("easy");
        System.out.println(isExist); //true

        //Ornek 7: “s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        //startsWith() methodu bir Strig’in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.

        boolean isStart = s.startsWith("Jav");
        System.out.println(isStart); //true

        //Ornek 8: “s" String'inin "easy" ile bitip bitmedigini kontrol ediniz.
        //endsWith() methodu bir Strig’in son karakterini/karakterlerini kontrol eder
        //endsWith() methodu boolean return eder.

        boolean isEnd = s.endsWith("y");
        System.out.println(isEnd); //true , y -->

    }
}
