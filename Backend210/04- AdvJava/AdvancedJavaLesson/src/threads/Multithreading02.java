package threads;

public class Multithreading02 {

    public volatile static int sayac=0;

    public static void main(String[] args) {

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {

                //bazı kodlar

                for (int i=1;i<10;i++){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("TOM-----bazı kodlar");
                }

                Sayac.count();

                //bazı kodlar
            }
        });
        thread1.setName("Tom");
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
               // thread1.join(); !!!!!!!!!!!!!!!!
                //bazı kodlar
                for (int i=1;i<10;i++){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("JERRY-----bazı kodlar");
                }

                Sayac.count();

                //bazı kodlar
            }
        });
        thread2.setName("Jerry");
        thread2.start();

//bu problemi join ile diğer threadi bekleterek çözemeyiz
//çünkü join diğer thread tüm işini bitirene kadar bekletir
//ve multithreading olmaz.sadece ortak kaynağa erişimi
//sıralı yapmak için synchronized kullanırız.

    }
}

class Sayac {
  //iki thread de aynı anda aynı(ortak) kaynağa (sayac değişkeni)
    //erişip okuma ve yazdırma işlemi yapmaya çalıştığı için
    //istenmeyen hatalı sonuç elde ettik.
    //çözüm:bu işlemler sıralı(senkron) bir şekilde yapılmalı.
    //synchronized:bir metoda aynı anda sadece 1 thread ulaşabilsin

    public synchronized static void count() {

        for (int i=1;i<=1000;i++){

            Multithreading02.sayac++;
            System.out.println(Thread.currentThread().getName()+"---> counter : "+Multithreading02.sayac);//2000
        }


    }

}


