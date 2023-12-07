package org.example;

public class Main {
    public static void main(String[] args) {
        Shape triangle=new Triangle();
        Shape triangle1=new Triangle();
        Shape circle=new Circle();

        Drawing drawing= new Drawing();
        drawing.add(triangle1);
        drawing.add(triangle);
        drawing.add(circle);

        drawing.draw("Green");

        drawing.add(triangle1);
        drawing.add(triangle);
        drawing.add(circle);

        drawing.draw("White");
    }
}
