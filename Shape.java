package Homework.Module8;

abstract class Shape {
    abstract String getName();
}
class Circle extends  Shape{
    @Override
    String getName() {
        return "Circle";
    }
}
class Quad extends  Shape{
    @Override
    String getName() {
        return "Quad";
    }
}
class Triangular extends Shape {
    @Override
    String getName() {
        return "Triangular";
    }

}
class Rhombus extends Shape {
    @Override
    String getName() {
        return "Rhombus";
    }
}
class Square extends Shape {
    @Override
    String getName() {
        return "Square";
    }
}
class DisplayName{
    public String showData(Shape shape)
    {
        return shape.getName();
    }

}




