package generics.interfaces.example;
//customer ın DB işlemleri
public class CustomerRepo implements Repository<Customer>{
    @Override
    public void save(Customer obj) {

    }

    @Override
    public Customer find(int id) {
        //kodlar....
        return null;
    }
}
