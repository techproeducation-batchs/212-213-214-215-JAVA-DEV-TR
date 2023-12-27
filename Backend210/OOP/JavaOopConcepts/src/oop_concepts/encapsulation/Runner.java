package oop_concepts.encapsulation;

public class Runner {
    public static void main(String[] args) {

        User user1=new User("Ali","Can","password");
        System.out.println(user1);
        user1.password="1234";

        System.out.println(user1);

//---------------encapsule olan user-------------------------------
        UserWithEncapsulation user2=new UserWithEncapsulation("Sherlock","Holmes","password");
        //user2.name;
        //user2.setName("Ali");
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        user2.setPassword("1234");
        System.out.println(user2.getPassword());


    }
}
