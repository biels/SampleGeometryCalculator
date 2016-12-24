package com.company;

import com.company.shapes.Circle;
import com.company.shapes.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biel on 24/12/16.
 */
public class Calculator {
    private List<Shape> registeredShapes = new ArrayList<>();
    Shape selectedShape;
    public Calculator() {
        this.registeredShapes.add(new Square());
        this.registeredShapes.add(new Circle());
    }

    public List<Shape> getRegisteredShapes() {
        return registeredShapes;
    }

    public void setSelectedShape(Shape selectedShape) {
        this.selectedShape = selectedShape;
    }

}
