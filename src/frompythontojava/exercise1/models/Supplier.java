package frompythontojava.exercise1.models;

import frompythontojava.exercise1.GenerateID;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by berloc on 2016.12.05..
 */
public class Supplier{

    private String name;
    private int id;
    private String description;
    private static List<Supplier>supplierList = new ArrayList();

    public Supplier(){
        id = GenerateID.generateID();
//        supplierList.add(this);
    }

    public Supplier(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static List<Supplier> getSupplierList() {
        return supplierList;
    }

    public static void setSupplierList(List<Supplier> supplierList) {
        Supplier.supplierList = supplierList;
    }
    public static void addToSupplierList(Supplier supplier){
        supplierList.add(supplier);
    }
}