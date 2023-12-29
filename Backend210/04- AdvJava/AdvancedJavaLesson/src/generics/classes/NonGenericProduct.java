package generics.classes;
//amacımız: ayrı ayrı laptop,book,mobilphone....classlar oluşturmak yerine
//sadece farklı data tipi ile kullanmak istediğimiz code fieldının ref. Object yaptık
public class NonGenericProduct {

    private Object code;//code fieldının data tipi object old. objectin childı olan
                       //tüm data tiplerinde değer alabilir

   //getter-setter
    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }
}
