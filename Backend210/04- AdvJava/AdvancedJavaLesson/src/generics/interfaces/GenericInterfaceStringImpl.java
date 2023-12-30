package generics.interfaces;
//2.SEÇENEK:Generic bir interfacei implemente ederken data tipine karar verilmeli

public class GenericInterfaceStringImpl implements GenericInterface<String>{


    @Override
    public void print(String value) {

    }

    @Override
    public String find() {
        return null;
    }
}
