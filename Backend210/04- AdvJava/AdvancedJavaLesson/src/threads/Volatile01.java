package threads;

public class Volatile01 {

   // public static int flag=0;//ihtimal:flag değişkenin değeri çekirdeklerin önbelleğine alınabilir.
    public volatile static int flag=0;//ihtimal:flag değişkenin değeri çekirdeklerin önbelleğine alınabilir.
    //volatile:işaretlenen değişkenin değerinin main memorye yazılmasını ve okunmasını garanti eder.


    public static void main(String[] args) {


        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag==0){//cache:0
                    System.out.println("Multithreading programlama CPUyu en verimli şekilde kullanmamızı sağlar.");
                }
            }
        });
        thread1.start();//Core 1 de çalışıyor.


        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                flag++;//cache:1
                System.out.println("flag değişkeninin değeri : "+flag);

            }
        });
        thread2.start();//Core 2 de çalışıyor.



    }


}
