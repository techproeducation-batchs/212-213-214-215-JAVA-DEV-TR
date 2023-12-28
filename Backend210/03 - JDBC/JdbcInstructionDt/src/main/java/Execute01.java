import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1-ADIM:Driverı kaydet
        Class.forName("org.postgresql.Driver");//Java 7 ye kadar zorunlu.

        //2-ADIM:DB ye bağlanma
        Connection con =DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/jdbc_dt","techpro","password");

        //3-ADIM:Statement oluşturma
        Statement st =con.createStatement();

        System.out.println("Success");

        //4-ADIM:Query çalıştırma

        //ÖRNEK 1:"workers" adında bir tablo oluşturup "worker_id,worker_name,salary" sütunlarını ekleyiniz.

        boolean sql1=st.execute("CREATE TABLE IF NOT EXISTS workers(worker_id INT, worker_name VARCHAR(50),salary REAL )");
        System.out.println("sql1 : "+sql1);


        /*
        execute:Sorgularımızı DB de çalıştırmak için kullanılır.
                sorgu sonucunda ResultSet nesnesi alıyorsa TRUE, aksi halde FALSE döndürür.
                1-DQL-->TRUE
                2-DDL--> FALSE
         Genellikle DDL için tercih edilir.
         */

        //ÖRNEK 2:"workers" tablosuna VARCHAR(20) tipinde "city" sütununu ekleyiniz.

//        boolean sql2=st.execute("ALTER TABLE workers ADD COLUMN city VARCHAR(20)");
//        System.out.println("sql2:"+sql2);

        //örnek 2 yi yoruma al.
        //ÖRNEK 3:"workers" tablosunu SCHEMAdan siliniz.

        st.execute("DROP TABLE IF EXISTS workers");

        //5-ADIM:statement ve baplantıyı kapatma
        st.close();
        con.close();


    }
}
