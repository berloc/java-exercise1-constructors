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
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String schedule(Date startDate, Date endDate){
        return ("Some schedule info about: " + this.getName() + ", start date: " + startDate + " " + "end date: " + endDate);
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