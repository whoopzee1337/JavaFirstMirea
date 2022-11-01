package ru.mirea.lab4;

public class ObjectWithPrice implements Priceable{
    private int price;
    public ObjectWithPrice(int price){
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
