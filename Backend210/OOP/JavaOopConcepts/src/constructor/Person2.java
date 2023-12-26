package constructor;

//Builder Design Pattern:nesne üretimini daha açık ve esnek hale getirmek

public class Person2 {

    private String name;//zorunlu
    private String surname;//zorunlu
    private int age;//0--opsiyonel
    private String phoneNumber;//opsiyonel

    //getter-setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //toString
    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    //Person2Builder classının objesini burada metod ile oluşturalım.
    public static Person2Builder builder(){
        return new Person2Builder();
    }

    public static void main(String[] args) {

        //builder kullanarak person2 nesnesi oluşturalım
        Person2 person=Person2.builder().
                        addName("Harry").
                        addSurName("Potter").
                        build();
        System.out.println(person);

        Person2 person2=Person2.builder().
                                addName("Sherlock").
                                addAge(53).
                                addPhoneNumber("12345").
                                build();
        System.out.println(person2);

        Person2 person3=Person2.builder().addName("Ali").addAge(32).addSurName("Can").build();











    }
}
