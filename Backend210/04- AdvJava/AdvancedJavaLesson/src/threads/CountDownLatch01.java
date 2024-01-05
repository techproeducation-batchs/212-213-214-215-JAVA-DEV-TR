package threads;

/*
bazı threadlerin(first worker threads) diğer threadler ve main thread önce çalışıp
işini bitirmesi bu arada diğer threadlerin beklemesini istediğimizde
CountDownLatch classı ile bir sayaç oluşturabiliriz.Öncelik verilen threadlerden
herbiri işini tamamladığında sayaç 1 azaltılır ve sayaç=0 olduğunda
diğer threadler de çalışmasına devam eder.
 */

import java.util.concurrent.CountDownLatch;

public class CountDownLatch01 {
    public static void main(String[] args) {

        CountDownLatch countDownLatch=new CountDownLatch(3);

        System.out.println("Burada main thread çalışıyor....");

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" çalışmaya başladı, kodlarını yazıyor..");
                try {
                    countDownLatch.await();//thread1 workerlar işini bitirene kadar bekler, sayac=0 olana kadar
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+" çalışmaya devam ediyor...");
                System.out.println(Thread.currentThread().getName()+" işini tamamladı.");

            }
        });
        thread1.setName("developer");
        thread1.start();


        WorkerThreads worker1=new WorkerThreads("A",2000,countDownLatch);
        WorkerThreads worker2=new WorkerThreads("B",5000,countDownLatch);
        WorkerThreads worker3=new WorkerThreads("C",3000,countDownLatch);
        worker1.start();
        worker2.start();
        worker3.start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Burada main thread çalışmaya devam ediyor.");





    }
}
class WorkerThreads extends Thread{

    public int duration;

    public CountDownLatch latch;

    public WorkerThreads(String name, int duration, CountDownLatch latch) {
        super(name);
        this.duration = duration;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" çalışmaya başladı...");
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" işini bitirdi...");
        latch.countDown();//2->1->0
        System.out.println(latch.getCount());

    }
}