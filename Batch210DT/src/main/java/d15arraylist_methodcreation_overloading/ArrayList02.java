package d15arraylist_methodcreation_overloading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz.
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //           [12, 23, 10, 19] ==> 12 ve 10

        //Iki turlu sort() kullanabiliriz
        //1- List icindeki sort (Java 8 sonrasi cikti)
        //2- Collections icindeki sort()

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        //nums.sort(null); //list'lerde dogal siralama icin null gecilmesi gerekir
        Collections.sort(nums);

        System.out.println(nums); //[10, 12, 19, 23]

        //Bu tarz sorularda once bir elemani en kucuk - en buyuk seceriz
        int minFark = nums.get(1) - nums.get(0); //12-10=2 yani buyukten kucugu cikardik

        for (int i = 1; i < nums.size(); i++) { //i'yi 1'den baslattik ki 1.den 0.yi cikaralim
            minFark = Math.min(minFark, nums.get(i) - nums.get(i - 1));
        }
        System.out.println(minFark);

        //En kucuk farki hangi iki sayidan elde ettigimizi bulalim
        for (int i = 1; i < nums.size(); i++) {
            //minFark'i hangi cikarma isleminde buldugumuzu arastiracagiz ve o cikarma
            //islemindeki sayilari konsola yazdiracagiz
            if (nums.get(i) - nums.get(i - 1) == minFark) { //[10, 12, 19, 20]
                System.out.println(nums.get(i) + " ve " + nums.get(i - 1));
            }

        }

    }
}
