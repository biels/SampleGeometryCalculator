package com.company.shapes;

import com.company.Magnitude;
import com.company.Parameter;
import com.company.Shape;

/**
 * Created by biel on 24/12/16.
 */
public class Circle extends Shape {
    Parameter radius = new Parameter("Radius");
    @Override
    public String getName() {
        return "Circle";
    }
    public Circle() {
        magnitudes.add(new Magnitude() {
            @Override
            public String getName() {
                return "Area";
            }

            @Override
            public Double calculate() {
                return Math.PI * Math.pow(radius.get(), 2);
            }
        });
        magnitudes.add(new Magnitude() {
            @Override
            public String getName() {
                return "Perimeter";
            }

            @Override
            public Double calculate() {
                return 2 * Math.PI * radius.get();
            }
        });
    }
}
