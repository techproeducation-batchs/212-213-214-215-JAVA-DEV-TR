package threads;

public class ThreadCreationWays {
    public static void main(String[] args) {

        //her java programında 1 tane default hthread başlatılır:main thread
        System.out.println("Mevcut thread 1: "+Thread.currentThread().getName());

        //1.YOL
        Thread thread1=new MyThread();
        thread1.start();//Threadi başlatır ve run metodunu çağırır.
        //thread1.run();-->sadece run içindeki kodları çalıştırır,fakat yeni bir thread başlatmaz.
        thread1.setName("threadcik");//deafult:Thread-0


        //2.YOL:Runnable bir functional interface:sadece 1 tane implemente edilecek metod var
        Runnable myrunnable=new MyRunnable();
        Thread thread2=new Thread(myrunnable);
        thread2.start();//Threadi başlatır ve run metodunu çağırır.


        //2.YOL:anonymous class
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Çalışan thread: "+Thread.currentThread().getName());
                System.out.println("Anonim sınıf ile thread oluşturuldu...");
            }
        });
        thread3.setName("anonim");
        thread3.start();


        //2.YOL:lambda
        Thread thread4=new Thread(()->{

            System.out.println("Çalışan thread: "+Thread.currentThread().getName());
            System.out.println("lambda ile thread oluşturuldu...");

        });
        thread4.setName("harika");
        thread4.start();




    }
}
//thread oluşturmanın SADECE 2 tane yolu var.
//1.YOL: Thread classını extend ederek

class MyThread extends Thread{

    @Override
    public void run() {
        //threade yaptırmak istediğimiz işlemler
        System.out.println("Mevcut thread 2: "+Thread.currentThread().getName());
        System.out.println("Mythread threadi çalışıyor.Harika:)");

    }

}

//2.YOL: Runnable Interfaceini implemente ederek
class MyRunnable implements Runnable{


    @Override
    public void run() {

        //threade yaptırmak istediğimiz işlemler
        System.out.println("Çalışan thread : "+Thread.currentThread().getName());
        System.out.println("Runnable ile oluşturduğumuz thread çalışıyor.Süper:)");

    }
}
