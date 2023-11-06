package d14arrays_arraylist;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Ornek 1: Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.

        // int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

        int[][] numbers = {{5, 4}, {2, 3, 2}};

        //1.adim : Iki boyutlu bir array'de kac eleman oldugunu bulan kodu yazacagiz
        //2.adim : Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz
        //3.adim : Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyiz
        //-----------------------
        //1.adim : Iki boyutlu bir array'de kac eleman oldugunu bulan kodu yazacagiz

        int toplamElemanSayisi = 0;

        for (int[] w : numbers){
          toplamElemanSayisi = toplamElemanSayisi + w.length;
        }

        System.out.println(toplamElemanSayisi); //5

        //2.adim : Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz

        int[] newArr = new int[toplamElemanSayisi];
        System.out.println(Arrays.toString(newArr)); //[0, 0, 0, 0, 0]

        //3.adim : Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyiz

        int idx = 0;

        for (int[] w : numbers){ //{5, 4}, {2, 3, 2}

            for (int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr)); //[5, 4, 2, 3, 2]


    }
}
