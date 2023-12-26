package constructor;

public class Book {

    //fieldlar
    //fieldların değerlerini burada set edersek default değer atamış oluruz.
    public String name/*="Vadideki Zambak"*/;
    public String author/*="Balzac"*/;
    public String publisher/*="Can Yayınları"*/;
    public int numberOfPage/*=542*/;
    public double price/*=154.0*/;


    //constructor:default
//    public Book(){}


    //obje oluşturulurken tüm fieldların değerleri set edilsin
    public Book(String bookName,String publisher,double price,int page,String authorName){
        this.name=bookName;
        this.publisher=publisher;//this burada zorunlu
        this.author=authorName;
        this.numberOfPage=page;
        this.price=price;
        //ekstra kodlar bulunabilir
    }

    //objenin fieldlarını string olarak yazdırabiliriz:toString


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numberOfPage=" + numberOfPage +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

//        Book book=new Book();
//        System.out.println(book.name);
//        book.name="kitabın yeni adı";

        Book book2=new Book("Aşk ve Gurur","Penguen Yayınları",200.0,300,"Jane Austen");
        System.out.println(book2);



    }
}
