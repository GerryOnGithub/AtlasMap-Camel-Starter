package com.jimbo.atlastest;

public class PurchaseOrder {

private final String name;

private final float price;

private final int amount;



public PurchaseOrder(String name) {

this.name = name;

this.price = 23;

this.amount = 23;

}



public String getName() {

return name;

}



public float getPrice() {

return price;

}



public int getAmount() {

return amount;

}



public String toString() {

return "Ordering " + amount + " of " + name + " at total " + price;

}

}


