import java.sql.*;

public class ExecuteQuery01 {
    public static void main(String[] args) throws SQLException {

        //1-ADIM:Driverı kaydet
    //    Class.forName("org.postgresql.Driver");//Java 7 ye kadar zorunlu.

        //2-ADIM:DB ye bağlanma
        Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/jdbc_dt","techpro","password");

        //3-ADIM:Statement oluşturma
        Statement st =con.createStatement();

        System.out.println("success");

        System.out.println("-------------ÖRNEK1---------------");
        //ÖRNEK 1:id'si 5 ile 10 arasında olan ülkelerin "country_name" bilgisini listeleyiniz.

        String sql1="SELECT country_name FROM countries WHERE id BETWEEN 5 AND 10 ";
        boolean query1=st.execute(sql1);
        System.out.println("query1 = " + query1);

        //verileri görmek için(resultset nesnesi almak için)

        ResultSet rs =st.executeQuery(sql1);
        while (rs.next()){

           System.out.println("ülke adı: "+rs.getString("country_name"));

         //   System.out.println("ülke adı: "+rs.getString(1));

        }

        System.out.println("-------------ÖRNEK2---------------");

        //ÖRNEK 2: phone_code'u 200 den büyük olan ülkelerin "phone_code" ve "country_name" bilgisini listeleyiniz.

        String sql2="SELECT phone_code,country_name FROM countries WHERE phone_code>200 ";
        ResultSet rs2=st.executeQuery(sql2);

        while (rs2.next()){
            System.out.println("tel kodu: "+rs2.getInt("phone_code")+
                    "---ülke adı: "+rs2.getString("country_name"));
        }

        System.out.println("-------------------------örnek3----------------------------------------");

        //ÖRNEK 3:developers tablosunda "salary" değeri minimum olan developerların tüm bilgilerini gösteriniz.

        String sql3="SELECT * FROM developers WHERE salary=(SELECT MIN(salary) FROM developers)";
        ResultSet rs3=st.executeQuery(sql3);

        while (rs3.next()){

            System.out.println("id: "+rs3.getInt("id")+"-- isim: "
                    +rs3.getString("name")+"--maaş: "
                    +rs3.getDouble("salary")+"--prog. dili : "+rs3.getString("prog_lang"));

        }

       //NOT:ResultSetde geriye dönüş yoktur.

        System.out.println("-----------------------ÖRNEK4------------------------------------------");

        //ÖRNEK 4:Puanı taban puanlarının ortalamasından yüksek olan öğrencilerin isim ve puanlarını listeleyiniz.

        String sql4="SELECT isim,puan FROM ogrenciler WHERE puan>(SELECT AVG(taban_puani) FROM bolumler )" +
                "ORDER BY puan";

        ResultSet rs4=st.executeQuery(sql4);

        while (rs4.next()){

            System.out.println("isim: "+rs4.getString("isim")+"--- puanı: "+rs4.getInt("puan"));

        }


      //5-ADIM
        st.close();
        con.close();


    }
}
