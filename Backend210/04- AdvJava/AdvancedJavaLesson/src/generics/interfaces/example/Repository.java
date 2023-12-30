package generics.interfaces.example;

public interface Repository<T> {

    void save(T obj);
    T find(int id);

    //...............


}
