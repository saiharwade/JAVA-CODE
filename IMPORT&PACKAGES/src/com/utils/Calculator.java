package com.utils;

public class Calculator {
    public static void main(String[]args){

        Circle c1 = new Circle(3);
        Rectangle r1 = new Rectangle(6,3);

        double area = c1.areaOfCircle();
        System.out.println(area);

        double areaofRec = r1.areaOfRec();
        System.out.println(areaofRec);

    }
}
