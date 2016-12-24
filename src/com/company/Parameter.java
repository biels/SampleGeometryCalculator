package com.company;

import java.util.Optional;
import java.util.Scanner;

/**
 * Created by biel on 24/12/16.
 */
public class Parameter {
    String name;
    Optional<Double> value = Optional.ofNullable(null);

    public Parameter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void request(){
        System.out.println(getName() + ": ");
        Scanner s = new Scanner(System.in);
        double v = s.nextDouble();
        setValue(v);
    }
    public Double get() {
        if(!value.isPresent())request();
        return value.get();
    }

    public void setValue(Double value) {
        this.value = Optional.of(value);
    }
}
