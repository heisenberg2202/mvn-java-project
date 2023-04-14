package com.example;

public class Mobile {
    private int id;
    private String name;
    private String company;
    private boolean bluetooth;
    private float price;
    
    public Mobile(){

    }

    public Mobile(int id, String name, String company, boolean bluetooth, float price) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.bluetooth = bluetooth;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
