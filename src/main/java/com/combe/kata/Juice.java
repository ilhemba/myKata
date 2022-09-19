package com.combe.kata;


public class Juice extends Drink {
    public static int drinkSold;
    public static final double PRICE = 0.6;
    public static final String JUICE_TYPE = "J";
    public static final int SUGAR = 0;
    public static final boolean HOT = false;

    public Juice() {
        super();
        this.type = JUICE_TYPE;
        this.sugar = SUGAR;
        this.price = PRICE;
        this.hot = HOT;
    }

    public void increaseSold() {
        drinkSold += 1;
    }

    public boolean isHot() {
        return hot;
    }

}

