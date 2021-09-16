package com.example.f21comp1011gcw2;

import java.util.ArrayList;

public class InterfaceExample {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);

    }
}
