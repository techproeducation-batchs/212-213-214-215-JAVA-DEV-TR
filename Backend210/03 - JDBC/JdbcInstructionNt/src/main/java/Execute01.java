import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

       //1-ADIM:driver ı kaydetme
        Class.forName("org.postgresql.Driver");//Java 7 ile birlikte gerek kalmadı.

       //2-ADIM:bağlantıyı oluşturma
        Connection con =DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/jdbc_nt","techpront","password");

        //3-ADIM:statement oluşturma

        Statement st =con.createStatement();

        System.out.println("success");

        //4-ADIM:sorguyu oluşturma/çalıştırma

        //ÖRNEK 1:"workers" adında bir tablo oluşturup "worker_id,worker_name,salary" sütunlarını ekleyiniz.
        boolean sql1=st.execute("CREATE TABLE IF NOT EXISTS workers(worker_id INT,worker_name VARCHAR(50),salary REAL)");
        System.out.println("sql1: "+sql1);


        /*
        execute:tüm sorguları çalıştırmak için kullanılır
         sorgunun sonucunda ResultSet alınıyorsa TRUE döndürür, aksi halde FALSE döndürür.
         1-DDL -->FALSE
         2-DQL -->TRUE
        genellikle DDL için kullanılır.

         */

        //ÖRNEK 2:"workers" tablosuna VARCHAR(20) tipinde "city" sütununu ekleyiniz.
     //   st.execute("ALTER TABLE workers ADD COLUMN city VARCHAR(20)");


        //örnek 2 yi yoruma alalım.
        //ÖRNEK 3:"workers" tablosunu SCHEMAdan siliniz.
        st.execute("DROP TABLE workers");


        //5-ADIM:kaynakları kapatma
        st.close();
        con.close();

    }

}
