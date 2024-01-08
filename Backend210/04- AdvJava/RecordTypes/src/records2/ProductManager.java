package records2;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    List<Product> products=new ArrayList<>();

    //ürün ekleme
    public void addProduct(Product product){
        products.add(product);
    }

    //ürün silme
    public void removeProduct(Product product){
        products.remove(product);
    }

    //tüm ürünleri listeleme
    public void listAllProducts(){
        for (Product product:products){
            System.out.println("Ürün adı: "+product.name()+" - fiyatı:"+product.price()+" - stok :"+product.stock());
        }
    }

    //stokta mevcut olan ürünleri filtreleme
    public void availableProducts(){

        for (Product product:products){
            if (product.stock()>0){
                System.out.println("Ürün adı: "+product.name()+" - fiyatı:"+product.price()+" - stok :"+product.stock());
            }
        }

    }


}
