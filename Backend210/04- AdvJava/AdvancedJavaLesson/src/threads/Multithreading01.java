package threads;

public class Multithreading01 {
    public static void main(String[] args) {

        //TASK: 1 den 10 a kadar 2 defa sayalım:sadece main thread

        long start=System.currentTimeMillis();

        Counter counter1=new Counter("Seval");
        Counter counter2=new Counter("Hüsnü");
        counter1.count();
        counter2.count();

        long finish=System.currentTimeMillis();

        System.out.println("Geçen süre : "+(finish-start));//10249


        System.out.println("-------------------Multithreading----------------------------");

        //TASK: 1 den 10 a kadar 2 defa sayalım:2 tane thread

        long start2=System.currentTimeMillis();

        Thread counter3=new CounterWithMultiThreading("Furkan");
        Thread counter4=new CounterWithMultiThreading("Gaukhar");
      //  Thread counter5=new CounterWithMultiThreading("Rümeysa");
        counter3.start();
        counter4.start();
      //  counter5.start();

        try {
            counter3.join();//hangi thread(main) içinde kullanılırsa counter3 işini bitirene kadar bekler
            counter4.join();//hangi thread(main) içinde kullanılırsa counter4 işini bitirene kadar bekler
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long finish2=System.currentTimeMillis();
        System.out.println("Thread ile Geçen süre : "+(finish2-start2));//5109





    }
}

class Counter{

    public String name;

    public Counter(String name) {
        this.name = name;
    }

    //1 den 10 a kadar saysın
    public void count(){

        for (int i=1;i<11;i++){

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i+" --- "+this.name);

        }

    }



}


//aynı taski multithreading ile yapalım
class CounterWithMultiThreading extends Thread{

    public String name;

    public CounterWithMultiThreading(String name) {
        this.name = name;
    }

    //1 den 10 a kadar saysın
    public void count(){

        for (int i=1;i<11;i++){

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i+" --- "+this.name);

        }

    }

    @Override
    public void run() {
        count();
    }
}

