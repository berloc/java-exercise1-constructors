package frompythontojava.exercise1.models;

import frompythontojava.exercise1.GenerateID;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by berloc on 2016.12.05..
 */
public class ProductCategory {

    private int id;
    private String name;
    private String description;
    private static List<ProductCategory>productCategoryList = new ArrayList();


    public ProductCategory(){
        id = GenerateID.generateID();
    }

    public ProductCategory(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static List<ProductCategory> getProductCategoryList() {
        return productCategoryList;
    }

    public static void setProductCategoryList(List<ProductCategory> productCategoryList) {
        ProductCategory.productCategoryList = productCategoryList;
    }

    public static void addToProductCategryList(ProductCategory productCategory) {
        productCategoryList.add(productCategory);
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}