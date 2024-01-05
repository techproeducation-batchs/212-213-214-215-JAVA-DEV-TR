package threads;

import java.util.concurrent.Semaphore;

/*
Semaphore, n(2,3...) tane threadin aynı anda ortak bir kaynağa erişmesine
izin vermemizi sağlar.

Synchronized, aynı anda ortak bir kaynağa(metod/blok) sadece 1 tane threadin
erişmesine izin veriyorduk.

 */
public class Semaphore01 {
    public static void main(String[] args) {

        Semaphore semaphore=new Semaphore(4);

        System.out.println("Toplam park yeri: "+semaphore.availablePermits());//4

        Car car1=new Car("Audi",1000,semaphore);
        Car car2=new Car("Volvo",2000,semaphore);
        Car car3=new Car("Porche",3000,semaphore);
        Car car4=new Car("Toyota",9000,semaphore);
        Car car5=new Car("Ford",1000,semaphore);
        Car car6=new Car("Honda",2000,semaphore);
        Car car7=new Car("Bugatti",3000,semaphore);
        Car car8=new Car("Togg",500,semaphore);
        Car car9=new Car("Lada",1000,semaphore);
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
        car6.start();
        car7.start();
        car8.start();
        car9.start();

    }
}
class Car extends Thread{

    public String carName;

    public int duration;

    public Semaphore semaphore;


    //param const
    public Car(String carName, int duration, Semaphore semaphore) {
        this.carName = carName;
        this.duration = duration;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(this.carName+" park etmek istiyor...");
        try {
            semaphore.acquire();//ortak olan kodlara erişim için izin isteniyor.
                                //müsait yer varsa izin belgesi verilir
            //ortak kaynağın başlangıcı
            System.out.println("--> "+this.carName+" park alanına girdi.");
            System.out.println(this.carName+" park alanında bekliyor......");
            Thread.sleep(duration);
            System.out.println("<-- "+this.carName+" park alanından çıkıyor.");
            //ortak kaynağın sonu
            semaphore.release();//çıkarken izin belgesi geri verilir

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}














