package records2;

public class Main {
    public static void main(String[] args) {

        Product product1=new Product("laptop",25000,6);
        Product product2=new Product("mobilphone",15000,0);

        ProductManager pm=new ProductManager();

        pm.addProduct(product1);
        pm.addProduct(product2);

        //tüm ürünleri listeleyelim
        pm.listAllProducts();

        //stoktaki ürünleri görelim
        System.out.println("stoktakiler");
        pm.availableProducts();

        //laptop ı silelim
        System.out.println("tüm ürünler");
        pm.removeProduct(product1);
        pm.listAllProducts();

        //product2 nin stok miktarını değiştirelim
        //product2.stock();
       // product2.setStock();








    }
}
