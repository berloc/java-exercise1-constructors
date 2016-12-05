package frompythontojava.exercise1.models;

import frompythontojava.exercise1.GenerateID;

import java.util.Date;

/**
 * Created by berloc on 2016.12.05..
 */
public class FeatureProductCategory extends ProductCategory {

    private int id;
    private Date startDate;
    private Date endDate;

    public FeatureProductCategory(){
        id = GenerateID.generateID();
    }

    public FeatureProductCategory(String name, String description){
        super(name, description);
        id = GenerateID.generateID();
    }

    @Override
    public String toString() {
        return "FeatureProductCategory{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}