package com.example.home3;

public class ProductDataModel {
    String name, course, price, location;

    ProductDataModel() {

    }

    public ProductDataModel(String name, String course, String location) {
        this.name = name;
        //this.price = price;
        this.location = location;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
//
//    public String getPurl() {
//        return purl;
//    }
//
//    public void setPurl(String purl) {
//        this.purl = purl;
//    }

}