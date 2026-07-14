package com.utils;

public class Rectangle {
    public double len;
    public double breath;

    public Rectangle(double len, double breath){
        this.len = len;
        this.breath = breath;
    }

    public double areaOfRec(){
        return this.len * this.breath;
    }

    public double circumOfRec(){
        return 2 * (len + breath);
    }
}
