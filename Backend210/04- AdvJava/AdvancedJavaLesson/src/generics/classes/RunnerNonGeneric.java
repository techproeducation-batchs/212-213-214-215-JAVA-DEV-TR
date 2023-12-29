package generics.classes;

public class RunnerNonGeneric {
    public static void main(String[] args) {

        //2 farklı obje:laptop, kitap
        NonGenericProduct book=new NonGenericProduct();
        book.setCode("advjava");//code değerini String ile set ettik

        NonGenericProduct laptop=new NonGenericProduct();
        laptop.setCode(123);//code değerini Integer ile set ettik


        String str= (String) book.getCode();//1-CAST problemi!!!
        System.out.println(str);

        String str2= (String) laptop.getCode();//1-CAST problemi!!!
        System.out.println(str2);//2-ClassCastException problemi!!!


    }
}
