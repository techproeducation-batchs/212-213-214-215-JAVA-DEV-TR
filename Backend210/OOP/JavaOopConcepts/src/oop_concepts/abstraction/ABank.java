package oop_concepts.abstraction;

public class ABank implements ATM_Machine{

    public int balance=0;

    @Override
    public void checkBalance() {
        System.out.println("Mevcut bakiye: "+this.balance);
    }

    @Override
    public void deposit(int amount) {
       this.balance+=amount;
        System.out.println("Mevcut bakiye: "+this.balance);

    }

    @Override
    public void withdraw(int amount) {
        this.balance-=amount;
        System.out.println("Mevcut bakiye: "+this.balance);
    }
}
