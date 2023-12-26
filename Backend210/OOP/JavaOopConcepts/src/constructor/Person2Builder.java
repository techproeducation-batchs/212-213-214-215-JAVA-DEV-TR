package constructor;
//builder classı Person2 objesinin üretimindeki süreci yönetmemizi sağlar
public class Person2Builder {

    private Person2 person2=new Person2();//field

    public Person2Builder addName(String name){
        this.person2.setName(name);
        return this;
    }

    public Person2Builder addSurName(String surname){
        this.person2.setSurname(surname);
        return this;
    }

    public Person2Builder addAge(int age){
        this.person2.setAge(age);
        return this;
    }

    public Person2Builder addPhoneNumber(String phone){
        this.person2.setPhoneNumber(phone);
        return this;
    }

    public Person2 build(){
        //builder nesnesi person2 objesini oluşturucak fakat name ve surname zorunlu
        if (this.person2.getName()==null || this.person2.getSurname()==null){
            throw new IllegalStateException("name ve surname zorunludur!!!");
        }
        return this.person2;
    }





}
