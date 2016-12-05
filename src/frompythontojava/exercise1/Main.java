package frompythontojava.exercise1;

import frompythontojava.exercise1.models.Product;
import frompythontojava.exercise1.models.ProductCategory;
import frompythontojava.exercise1.models.Supplier;

public class Main {

    public static void main(String[] args) {
        ProductCategory smartphone = new ProductCategory("phones", "phones");
        ProductCategory computer = new ProductCategory();

        Supplier apple = new Supplier();
        Supplier.addToSupplierList(apple);

        Supplier samsung = new Supplier("Samsung", "something");


        Product phone1 = new Product("Iphone SE", 2342, smartphone, apple);
        Product macBook = new Product();
        Product phone2 = new Product("Samsung 8s", 3342, smartphone, samsung);


        System.out.println(phone1.toString());
        System.out.println(phone2.toString());

//        System.out.println(phone1.getName());
        System.out.println(Product.getProductList().size());
        Product.addToProductList(macBook);
        System.out.println(Product.getProductList().size());


    }
}
