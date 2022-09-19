package com.combe.kata;

public class Chocolate extends Drink {
    public static int drinkSold;
    public static final double PRICE = 0.5;
    public static final String CHOCOLATE_TYPE = "H";
    private int sugar;

    public Chocolate(int sugar, boolean hot) {
        super();
        this.price = PRICE;
        this.type = CHOCOLATE_TYPE;
        this.sugar = sugar;
        this.hot = hot;
    }
    public void increaseSold() {
        drinkSold += 1;
    }

    @Override
    public int getSugar() {
        return sugar;
    }

    @Override
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public boolean isHot() {
        return hot;
    }
}
