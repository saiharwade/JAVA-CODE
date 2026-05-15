package com.example.geometry;
import java.lang.Math; // the lang package is by default imported in every code so no need to import explecitly
public class Circle {
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double areaOfCircle(){
        return Math.PI * radius * radius;
    }// the pi value is in points so return should be double

    public double circumOfCircle(){
        return 2 * Math.PI * this.radius;
    }
}