package com.example.w22t16;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "yellow";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = "black";
    }
}
