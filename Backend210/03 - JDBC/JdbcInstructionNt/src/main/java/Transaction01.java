import java.sql.*;

/*
Transaction: DB de en küçük işlem birimi(parçalanamaz,atomik)
Bazı durumlarda transaction yönetimini ele alabiliriz.
Bir veya birden fazla işlemi bir araya getirerek tek bir transaction başlatabiliriz.
Bu işlemlerden en az 1 i başarısız olduğunda yada herhangi bir koşulda
transactionı ROLLBACK ile geri alabiliriz
İşlemlerin tamamı başarılı olduğunda ise COMMIT ile onaylayarak
transactionı sonlandırıp değişiklikleri kalıcı hale getirebiliriz.

 */


public class Transaction01 {
    public static void main(String[] args) throws SQLException {


        Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/jdbc_nt","techpront","password");

        Statement st =con.createStatement();

        st.execute("CREATE TABLE IF NOT EXISTS hesaplar (hesap_no INT UNIQUE, isim VARCHAR(50), bakiye REAL)");

        String sql1 = "INSERT INTO hesaplar VALUES (?,?,?) ";
        PreparedStatement prst1 = con.prepareStatement(sql1);
        prst1.setInt(1, 1234);
        prst1.setString(2,"Fred");
        prst1.setDouble(3,9000);
        prst1.executeUpdate();

        prst1.setInt(1, 5678);
        prst1.setString(2,"Barnie");
        prst1.setDouble(3,6000);
        prst1.executeUpdate();

        //TASK: hesap no:1234 ten hesap no:5678 e 1000$ para transferi olsun.

        try{


           String sql2="UPDATE hesaplar SET bakiye=bakiye+? WHERE hesap_no=?";
           PreparedStatement prst=con.prepareStatement(sql2);
            //1-adım: hesap no:1234 hesabın bakiye güncelleme
            prst.setInt(1,-1000);
            prst.setInt(2,1234);
            prst.executeUpdate();

            //sistemde hata oluştu kabul edelim
            if (true){
                throw new RuntimeException();//hatayı ele aldık
            }



           //2-adım:hesap no:5678 hesabın bakiye güncelleme
            prst.setInt(1,1000);
            prst.setInt(2,5678);
            prst.executeUpdate();//bu sorgu çalışmaz

        }catch(Exception e){
            System.out.println("Sistemde hata oluştu.");

            e.printStackTrace();
        }

        //işlemlerden 1 i başarılı diğeri başarısız oldu
        //veriler tutarsız
        st.close();
        con.close();




















    }
}
