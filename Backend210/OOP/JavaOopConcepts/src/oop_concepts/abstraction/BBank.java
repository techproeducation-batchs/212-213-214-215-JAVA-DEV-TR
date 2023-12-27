package oop_concepts.abstraction;

public class BBank implements ATM_Machine{

    public int balance;
    @Override
    public void checkBalance() {
        System.out.println("Mevcut bakiye : 150");
    }

    @Override
    public void deposit(int amount) {
         this.balance+=amount+100;
    }

    @Override
    public void withdraw(int amount) {
        this.balance-=amount;
    }
}
