package com.combe.kata;

public class Tea extends Drink {
    public static int drinkSold;
    public static final double PRICE = 0.4;
    public static final String TEA_TYPE = "T";
    private int sugar;

    @Override
    public int getSugar() {
        return sugar;
    }

    public boolean isHot() {
        return hot;
    }

    public Tea(int sugar, boolean hot) {
        super();
        this.price = PRICE;
        this.type = TEA_TYPE;
        this.sugar = sugar;
        this.hot = hot;
    }
    public void increaseSold(){
        drinkSold += 1;
    }

}
