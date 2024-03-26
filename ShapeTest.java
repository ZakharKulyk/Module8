package Homework.Module8;

import Homework.Module8.Circle.Circle;
import Homework.Module8.Quad.Quad;
import Homework.Module8.Rhombus.Rhombus;

import Homework.Module8.ShapeUtil.Shape;
import Homework.Module8.ShapeUtil.ShapePrinter;
import Homework.Module8.Square.Square;
import Homework.Module8.Triangular.Triangular;

public class ShapeTest {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangular();
        Shape square  = new Square();
        Shape rhombus = new Rhombus();

        shapePrinter.printFigure(circle);


    }
}
