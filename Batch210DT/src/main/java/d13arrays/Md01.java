package d13arrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //Java’da çok boyutlu dizi (MultiDimensional Array) temel olarak arrayin içine array koymak anlamına gelir.
        // En yaygın örneği iki boyutlu dizilerdir, ki bunlar genellikle matris olarak düşünülebilir.
        // İki boyutlu bir dizi, satır ve sütunlardan oluşur, tıpkı bir Excel tablosu gibi.

        //MultiDimensional Array nasil olusturulur?

        int[][] a = new int[3][2]; //3 distaki, 2 icteki eleman sayisi

        a[0][0] = 5;
        a[0][1] = 12;
        a[1][0] = 81;
        a[1][1] = 45;
        a[2][0] = 123;
        a[2][1] = 5;

        //System.out.println(Arrays.toString(a)); //[[I@4617c264, [I@36baf30c, [I@7a81197d]

        //MultiDimensional Array'leri yazdirirken toString() kullanilmaz. deepToString() kullanilir.

        System.out.println(Arrays.deepToString(a)); //[[5, 12], [81, 45], [123, 5]]

        //MultiDimensional Array'den spesifik bir eleman nasil yazdirilir?
        System.out.println(a[1][1]); //45

        //MultiDimensional Array icindeki bir array nasil yazdirilir?
        System.out.println(Arrays.toString(a[2])); //[123, 5] tek bir array'e ulastik

        //Kisa yoldan MultiDimensional Array nasil olusturulur?

        String[][] students = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Burhan"}};

        //---------------
        //Ornek 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int toplam = 0;

        for (String[] w : students){ //{{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Burhan"}}
            toplam = toplam + w.length;

        }
        System.out.println(toplam); //8

        //Ornek 2: Yukaridaki students Array'inde icinde "m" olan isimleri console'a yazdiriniz
        System.out.println("--------------");
        for (String[] w : students){
            for (String k : w){
                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }

    }
}
