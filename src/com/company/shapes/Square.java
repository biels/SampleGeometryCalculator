package com.company.shapes;

import com.company.Magnitude;
import com.company.Parameter;
import com.company.Shape;

/**
 * Created by biel on 24/12/16.
 */
public class Square extends Shape {
    Parameter side = new Parameter("Side");
    public Square() {
        magnitudes.add(new Magnitude() {
            @Override
            public String getName() {
                return "Area";
            }

            @Override
            public Double calculate() {
                return side.get() * side.get();
            }
        });
    }

    @Override
    public String getName() {
        return "Square";
    }
}
