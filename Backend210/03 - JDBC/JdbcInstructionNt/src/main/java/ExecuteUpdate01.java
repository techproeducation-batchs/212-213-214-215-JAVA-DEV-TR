import java.sql.*;


//executeUpdate():DML için kullanılır; INSERT INTO,UPDATE,DELETE
//return:(int) sorgunun sonucundan etkilenen kayıt sayısını verir
public class ExecuteUpdate01 {
    public static void main(String[] args) throws SQLException {


        //2-ADIM:bağlantıyı oluşturma
        Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/jdbc_nt","techpront","password");

        //3-ADIM:statement oluşturma

        Statement st =con.createStatement();

        System.out.println("success");

     //   kayıtların tamamını görelim
        System.out.println("----------------UPDATEden önce------------------------------");
        ResultSet rs =st.executeQuery("SELECT * FROM developers");
        while(rs.next()){

            System.out.println(rs.getString("name")+"------"+rs.getDouble("salary"));

        }

      //  ÖRNEK1:developers tablosunda maaşı ortalama maaştan az olanların maaşını ortalama maaş ile güncelleyiniz
        String sql1="UPDATE developers SET salary=(SELECT AVG(salary) FROM developers) WHERE salary<(SELECT AVG(salary) FROM developers)";
        int updated=st.executeUpdate(sql1);

        System.out.println("Güncellenen kayıt sayısı: "+updated);

   //     kayıtların tamamını görelim
        System.out.println("----------------UPDATEden sonra------------------------------");
        ResultSet rs2 =st.executeQuery("SELECT * FROM developers");
        while(rs2.next()){

            System.out.println(rs2.getString("name")+"------"+rs2.getDouble("salary"));

        }

        System.out.println("--------------------------------------------------------------");




        st.close();
        con.close();




    }
}
