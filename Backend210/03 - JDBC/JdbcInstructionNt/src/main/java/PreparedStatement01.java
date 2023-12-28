
/*
PreparedStatement; önceden derlenmiş tekrar tekrar kullanılabilen
parametreli sorgular oluşturmamızı ve çalıştırmamızı sağlar.

PreparedStatement Statement ı extend eder(statementın gelişmiş halidir.)
 */


import java.sql.*;

public class PreparedStatement01 {

    public static void main(String[] args) throws SQLException {

        //2-ADIM:bağlantıyı oluşturma
        Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/jdbc_nt","techpront","password");

        //3-ADIM:statement oluşturma

        Statement st =con.createStatement();

        //ÖRNEK1: bolumler tablosunda Matematik bölümünün taban_puanı'nı 475 olarak güncelleyiniz.
//        String sql1="UPDATE bolumler SET taban_puani=475 WHERE bolum ILIKE 'Matematik'";
//        int updated=st.executeUpdate(sql1);
//        System.out.println("updated = " + updated);

        //Prepared Statement kullanarak bolumler tablosunda Matematik bölümünün taban_puanı'nı 499 olarak güncelleyiniz.

        //parametreli sorguyu hazırlayalım
        String sql2="UPDATE bolumler SET taban_puani=? WHERE bolum ILIKE ?";
        PreparedStatement prst =con.prepareStatement(sql2);

        prst.setInt(1,499);
        prst.setString(2,"Matematik");
        //UPDATE bolumler SET taban_puani=499 WHERE bolum ILIKE 'Matematik'

        int updated2=prst.executeUpdate();
        System.out.println("updated2 = " + updated2);


        //Örnek2: Prepared Statement kullanarak bolumler tablosunda Edebiyat bölümünün taban_puanı'nı 477 olarak güncelleyiniz.
        prst.setString(2,"Edebiyat");
        prst.setInt(1,477);

        prst.executeUpdate();


        //Örnek 3:Prepared Statement kullanarak bolumler tablosuna
        // Yazılım Mühendisliği(id=5006,taban_puanı=475, kampus='Merkez') bölümünü ekleyiniz.


        String sql3="INSERT INTO bolumler VALUES(?,?,?,?)";
        PreparedStatement prst2=con.prepareStatement(sql3);

        prst2.setInt(1,5006);
        prst2.setString(2,"Yazılım Mühendisliği");
        prst2.setInt(3,475);
        prst2.setString(4,"Merkez");

        prst2.executeUpdate();


        //Örnek 4:Prepared Statement kullanarak developers tablosundan
        // prog_lang C# olan kayıtları siliniz.(ALIŞTIRMA)

        //Örnek 5:Prepared Statement kullanarak developers tablosundan
        // prog_lang C++ olan kayıtları siliniz.(ALIŞTIRMA)


        st.close();
        con.close();


    }


}
