package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by biel on 24/12/16.
 */
public abstract class Shape {
    protected List<Magnitude> magnitudes = new ArrayList<>();
    protected List<Parameter> parameters = new ArrayList<>();

    public abstract String getName();

    public List<Magnitude> getMagnitudes() {
        return magnitudes;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }
}
