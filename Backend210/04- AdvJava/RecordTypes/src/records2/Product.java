package records2;

public record Product(String name,double price,int stock) {

    //setter metodlarının tanımlanmasına izin vermez, default olarak immutable

//    public void setStock(int stock){
//        this.stock=stock;
//
//    }



}
