package oop_concepts.abstraction;

public class Main {
    public static void main(String[] args) {

        //98 ile 74 değerlerini toplamak istiyoruz.

        Calculator calculator=new Calculator();
        int total=calculator.add(98,74);//add metodu nasıl toplama yapıyor bilmiyoruz.

        Math.addExact(52,36);

        //metodlar ile soyutlama yapıyoruz.

 //----------------------------------------------------------------

        ATM_Machine atm=new BBank();//kodları onarmak istiyoruz, B bank ile çalışacağız
        atm=new ABank();
        atm.deposit(100);
        atm.checkBalance();
        atm.withdraw(50);

//Statement st
//st.execute();-->nasıl çalıştığını bilmiyoruz.



    }
}
