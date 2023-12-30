package generics.interfaces.example;

//account ın DB işlemleri
public class AccountRepo implements Repository<Account>{


    @Override
    public void save(Account obj) {

    }

    @Override
    public Account find(int id) {
        return null;
    }
}
