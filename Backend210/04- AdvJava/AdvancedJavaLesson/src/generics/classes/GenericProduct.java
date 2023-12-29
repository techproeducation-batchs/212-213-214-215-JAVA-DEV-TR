package generics.classes;
//amacımız: ayrı ayrı laptop,book,mobilphone....classlar oluşturmak yerine
//Product classının farklı data parametreleri alarak çalışmasını sağlamak

public class GenericProduct<T> {
 //generic olarak sadece NON-PRIMITIVE data tipleri kullanılır.
          /*
        E --> Element, collection gibi yapılarda kullanılır
        K --> Key
        V --> Value
        N --> Number
        T --> Type
        S,U,V , vb --> 2., 3. ve 4. tipler için
      */

    private T code;

    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }
}
