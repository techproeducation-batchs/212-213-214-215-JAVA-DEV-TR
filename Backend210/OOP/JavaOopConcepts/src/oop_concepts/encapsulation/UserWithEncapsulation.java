package oop_concepts.encapsulation;

public class UserWithEncapsulation {

    //daalara erişim kontrolünü ele almak
    private String name;
    private String surname;
    private String password;

    public UserWithEncapsulation(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    //getter-setter

    public String getName() {
        return name;
    }

    //name görüntülesin ama değişmesin
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return "*".repeat(password.length());
    }

    public void setPassword(String password) {
        if (password.length()==6){
            this.password = password;
        }
    }
}
