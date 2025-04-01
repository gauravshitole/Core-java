package com.week2;

import com.week2.shap.Reactangle;

public class ShapeOperations {

    public static int areaOfReactangle(int length, int breadth){
return  length*breadth;
    }
    public static int areaOfReactangle(Reactangle reactangle){
        return  reactangle.getLength() * reactangle.getBreadth();
    }
public static  int areaOfSqure(int side){
        return  side*side;
}
}
