package threads;

public class SynchronizedBlock {
    public static void main(String[] args) {

        Brackets brackets=new Brackets();

        //TASK: Ekrana 14 defa [ [ [ [ [ ] ] ] ] ] yazdıralım.
        //bu taski 2 tane thread birlikte yapsın
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=7;i++){
                    brackets.generateBrackets();

                }
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=7;i++){
                    brackets.generateBrackets();

                }
            }
        });

        long start=System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long finish=System.currentTimeMillis();

        System.out.println("geçen süre:"+(finish-start));
        //synchronized metod süresi:35760
        //synchronized blok süresi:17910




    }
}
class Brackets{
//aynı anda bu metoda sadece 1 thread ulaşsın:synchronized
    public /*synchronized */void generateBrackets(){

        synchronized (this) {//aynı anda bu bloğa sadece 1 thread ulaşsın:synchronized

            for (int i = 1; i <= 10; i++) {
                if (i < 6) {
                    System.out.print("[ ");
                } else {
                    System.out.print("] ");
                }
            }
            System.out.println("   --> " + Thread.currentThread().getName());
      }


        //senkron olması gerekmeyen kodlar var
        for (int i=1;i<6;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }

    }

}