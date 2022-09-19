package com.combe.kata;

public class Coffe extends Drink {
    public static int drinkSold;
    public static final double PRICE = 0.6;
    public static final String COFFEE_TYPE = "C";
    private int sugar;


    public Coffe(int sugar, boolean hot) {
        super();
        this.price = PRICE;
        this.type = COFFEE_TYPE;
        this.sugar = sugar;
        this.hot = hot;
    }

    @Override
    public int getSugar() {
        return sugar;
    }

    @Override
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void increaseSold() {
        drinkSold += 1;
    }

    public boolean isHot() {
        return hot;
    }
}

