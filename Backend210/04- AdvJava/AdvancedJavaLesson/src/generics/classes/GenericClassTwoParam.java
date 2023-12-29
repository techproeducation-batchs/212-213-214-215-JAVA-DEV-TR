package generics.classes;

public class GenericClassTwoParam<S,U> {

    private S anahtar;

    private U deger;

    private String name;

    //param const

    public GenericClassTwoParam(S anahtar, U deger, String name) {
        this.anahtar = anahtar;
        this.deger = deger;
        this.name = name;
    }


    //getter-setter

    public S getAnahtar() {
        return anahtar;
    }

    public void setAnahtar(S anahtar) {
        this.anahtar = anahtar;
    }

    public U getDeger() {
        return deger;
    }

    public void setDeger(U deger) {
        this.deger = deger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
