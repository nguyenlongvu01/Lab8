package com.vunlph30245.lab7activity.retrofit;

public class Prd {
    private String name,price,desciption;

    public Prd(String name, String price, String desciption) {
        this.name = name;
        this.price = price;
        this.desciption = desciption;
    }

    public Prd() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
