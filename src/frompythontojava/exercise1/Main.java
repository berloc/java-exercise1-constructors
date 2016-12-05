package frompythontojava.exercise1;

import frompythontojava.exercise1.models.FeatureProductCategory;
import frompythontojava.exercise1.models.Product;
import frompythontojava.exercise1.models.ProductCategory;
import frompythontojava.exercise1.models.Supplier;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ProductCategory smartPhone = new ProductCategory("phones", "phones");
        ProductCategory computer = new ProductCategory();
        ProductCategory.addToProductCategryList(computer);

        Supplier apple = new Supplier();
        Supplier.addToSupplierList(apple);
        Supplier samsung = new Supplier("Samsung", "something");


        Product phone1 = new Product("Iphone SE", 2342, smartPhone, apple);
        Product macBook = new Product();
        Product.addToProductList(macBook);
        Product phone2 = new Product("Samsung 8s", 3342, smartPhone, samsung);
        Product MacBooker = new Product("MacBooker", 3333, computer, apple);

        FeatureProductCategory someThing1 = new FeatureProductCategory();
        FeatureProductCategory.addToProductCategryList(someThing1);
        FeatureProductCategory someThing2 = new FeatureProductCategory("Something", "Description");

        Date startDate = new Date();
        Date endDate = new Date();
        System.out.println(someThing2.schedule(startDate, endDate));



        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(MacBooker.toString());


        System.out.println(Product.getProductList().size());


    }
}
