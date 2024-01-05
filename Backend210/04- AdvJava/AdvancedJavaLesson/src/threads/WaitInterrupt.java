package threads;


/*Bir öğrencinin banka hesabı için para yatırma(deposit) ve çekme işlemleri(withdraw) için uygulama
        Hesapta para yoksa para yatırılması(bakiyenin artması) beklensin.
        Bakiye artınca(yeterli olunca) para çekme gerçekleşsin.*/
//wait-interrupt threadler arasında iletişimi sağlar
public class WaitInterrupt {

    public static int balance=0;

    //veli : para yatırma
    public synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+" para yatırmak istiyor.");
        balance+=amount;
        System.out.println("Para yatırma işlemi başarılı. Mevcut bakiye : "+balance);
    }

    //öğrenci: para çekme
    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" para çekmek istiyor.");
        if (balance==0 || balance<amount){
            System.out.println("Bakiye yetersiz!!! Mevcut bakiye : "+balance);
            System.out.println("Bakiyenin güncellenmesi bekleniyor...");
            try {
                wait();//thread1 bekleyecek:thread2 nin işini yapmasını bekleyecek,
                       //monitör edilen obje geçici olarak serbest bırakılır
                       //notify ile uyarılana kadar
            } catch (InterruptedException e) {
                System.out.println("bakiye güncellendi. işleme devam ediliyor.");
            }
        }

        //notify ile uyarılan thread kaldığı yerden devam eder.
        if (balance>=amount){
            balance-=amount;
            System.out.println("Para çekme işlemi başarılı. Mevcut bakiye : "+balance);
        }else {
            System.out.println("Bakiye yetersiz!!! Mevcut bakiye : "+balance);
            System.out.println("Umudunu kaybetme...");

        }
    }




    public static void main(String[] args) {

        WaitInterrupt obj=new WaitInterrupt();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(1000);
            }
        });
        thread1.setName("tüketici");
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.deposit(2000);
                thread1.interrupt();//thread1 in beklemesini kesintiye uğratır
            }
        });
        thread2.setName("üretici");
        thread2.start();



    }
}
