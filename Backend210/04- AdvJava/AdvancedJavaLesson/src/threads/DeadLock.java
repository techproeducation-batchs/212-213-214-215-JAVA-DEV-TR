package threads;
/*
Ölümcül kilitlenme; iki veya daha fazla threadin çalışmak için
aynı kaynak/lar/a erişmek istemesiyle oluşur.

Kaynağa erişmek için sürekli birbirlerini beklemesi sonucunda
sistemler kaynakları olumsuz etkilenir ve uygulama cevap veremez
hale gelir.
 */
public class DeadLock {
    public static void main(String[] args) {

        String seker="Şeker";
        String kahve="Kahve";


        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (kahve){
                    System.out.println(Thread.currentThread().getName()+" "+kahve+" yi kullanıyor...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+" "+seker+" i istiyor...");
                    synchronized (seker){
                        System.out.println(Thread.currentThread().getName()+" "+seker+" yi kullanıyor...");
                    }//seker serbest bırakıldı
                }//kahve de serbest bırakıldı.
                System.out.println(Thread.currentThread().getName()+" sıcak suyu ekledi ve kahvesini içiyor...");

            }
        });
        thread1.setName("Tom");
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (seker){
                    System.out.println(Thread.currentThread().getName()+" "+seker+" yi kullanıyor...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+" "+kahve+" i istiyor...");
                    synchronized (kahve){
                        System.out.println(Thread.currentThread().getName()+" "+kahve+" yi kullanıyor...");
                    }//kahve serbest bırakıldı
                }//seker de serbest bırakıldı.
                System.out.println(Thread.currentThread().getName()+" sıcak suyu ekledi ve kahvesini yudumluyor...");

            }
        });
        thread2.setName("Jerry");
        thread2.start();



    }
}
