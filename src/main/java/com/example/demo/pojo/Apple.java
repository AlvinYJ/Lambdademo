package com.example.demo.pojo;

/**
 * Create By Alvin on 2018/7/25
 **/
public class Apple {
    private String color;
    private int weight;
    private float price;

    public Apple(String  color) {
        this.color = color;
    }

    public void setColor() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
