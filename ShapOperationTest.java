package com.week2;

import com.week2.shap.Reactangle;

public class ShapOperationTest {
    public static void main(String[] args) {
        ShapeOperations shapeOperations = new ShapeOperations();
        int areaOfReact = ShapeOperations.areaOfReactangle(10, 6);
        System.out.println("Area of react angle is:" + areaOfReact);
  Reactangle reactangle=new Reactangle(11,8);

  int objectOfReactangle=ShapeOperations.areaOfReactangle(reactangle);
        System.out.println("oject is  "+ objectOfReactangle);
    }
}
