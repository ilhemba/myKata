package com.combe.kata;

public abstract class Drink {
    public static double totalAmount;
    protected int sugar;
    protected String type;
    protected double price;
    protected boolean hot;

    public Drink() {

    }

    public abstract void increaseSold();

    public static void increaseTotalAmount(double amount){
        totalAmount += amount;
    }


    public int getSugar() {
        return sugar;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public abstract boolean isHot();

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }
}