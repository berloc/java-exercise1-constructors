package frompythontojava.exercise1.models;

import frompythontojava.exercise1.GenerateID;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by berloc on 2016.12.05..
 */
public class Product {

    private int id;
    private String name;
    private float defaultPrice;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList = new ArrayList();


    public Product() {
        id = GenerateID.generateID();
    }

    public Product(String name){
        id = GenerateID.generateID();
        this.name = name;
    }

    public Product(String name, float defaultPrice,ProductCategory productCategory, Supplier supplier){
        this.id = GenerateID.generateID();
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
        this.supplier = supplier;
        productList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public static List<Product> getProductList() {
        return productList;
    }

    public static void setProductList(List<Product> productList) {
        Product.productList = productList;
    }

    public static void addToProductList(Product product){
        productList.add(product);
    }
    public int getId() {
        return id;
    }

    public ArrayList getAllBySupplier(Supplier supplier){
        List<Product>products = new ArrayList();
        for (Product product: Product.getProductList()) {
            if (product.getSupplier() == supplier) {
                products.add(product);
            }
        }
        return (ArrayList) products;
    }

    public ArrayList getAllByProductCategory(ProductCategory productCategory){
        List<Product>products = new ArrayList();
        for (Product product: Product.getProductList()) {
            if (product.getProductCategory() == productCategory) {
                products.add(product);
            }
        }
        return (ArrayList) products;
    }

    @Override
    public String toString() {
        return "Product" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", defaultPrice=" + defaultPrice +
                ", productCategory=" + this.productCategory.getName() +
                ", supplier=" + this.supplier.getName();
    }
}