package com.company;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //1 shape
        //2 magnitude
        //3 Request params
        while (true){
            System.out.println("####SHAPE CALCULATOR####");
            Calculator calculator = new Calculator();
            Scanner s = new Scanner(System.in);

            //Shape
            System.out.println("Select shape type");
            String possibleShapes = calculator.getRegisteredShapes().stream().map(shape -> shape.getName()).reduce((s1, s2) -> s1 + ", " + s2).get();
            System.out.println("[" + possibleShapes + "]");
            String shapeTypeStr = s.nextLine();
            Optional<Shape> shapeOptional = calculator.getRegisteredShapes().stream().filter(shape -> shape.getName().equalsIgnoreCase(shapeTypeStr)).findFirst();
            if(!shapeOptional.isPresent()){
                System.out.println("Use a shape from the list above");
                continue;
            }
            Shape shape = shapeOptional.get();
            calculator.setSelectedShape(shape);

            //Magnitude
            System.out.println("Select magnitude");
            String possibleMagnitudes = shape.getMagnitudes().stream().map(Magnitude::getName).reduce((s1, s2) -> s1 + ", " + s2).get();
            System.out.println("[" + possibleMagnitudes + "]");
            String magintudeStr = s.nextLine();
            Optional<Magnitude> magnitudeOptional = shape.getMagnitudes().stream().filter(magnitude -> magnitude.getName().equalsIgnoreCase(magintudeStr)).findFirst();
            if(!magnitudeOptional.isPresent()){
                System.out.println("Use a magnitude from the list above");
                continue;
            }
            Magnitude magnitude = magnitudeOptional.get();
            System.out.println("Result: " + magnitude.calculate());
        }
    }
}
