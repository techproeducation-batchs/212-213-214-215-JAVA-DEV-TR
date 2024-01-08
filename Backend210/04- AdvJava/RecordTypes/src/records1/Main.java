package records1;

public class Main {
    public static void main(String[] args) {

        Employee emp=new Employee("Jack","Sparrow","mail@mail.com" );
        System.out.println(emp);

        //uygulamanın herhangi bir yerinde ismini değiştirmek istersem.
        emp.setFirstName("Bradd");
        System.out.println("ismi değişmiş olan çalışan : "+emp);

        //bazı durumlarda bir kere değerleri belirlendikten sonra fieldları
        //değiştirilemeyen nesnelere ihtiyaç duyarız.

        //Immutable Class

        EmployeeImmutable emp2=new EmployeeImmutable("Harry","Potter","mail@mail.com");
        System.out.println("immutable nesne: "+emp2);

      //  emp2.setFirstName("ALi");,

        EmployeeImmutable emp3=new EmployeeImmutable("Harry","Potter","mail@mail.com");

        System.out.println("double equal ile "+(emp2==emp3));//false
        System.out.println("equals ile : "+emp2.equals(emp3));//true


        //peki immutable employee sınıfını daha az boiler plate(basma kalıp)
        //kod kullanarak oluşturamaz mıyız?

        //Cevap:Java 14 ile birlikte Record ile yapabiliriz.

        EmployeeRecord emp4=new EmployeeRecord("Ali","Can","ali@mail.com");
        System.out.println("Record employee : "+emp4);

        //emp4.setFirstName("");-->immutable

        EmployeeRecord emp5=new EmployeeRecord("Ali","Can","ali@mail.com");

        System.out.println("emp4 ve 5 aynı mı double equal : "+(emp4==emp5));//false
        System.out.println("emp4 ve 5 aynı mı : "+emp4.equals(emp5));//true



    }
}
