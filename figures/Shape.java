package Homework.Module8.ShapeUtil;

public abstract class Shape implements  ShapeUtils {
    private String name;

    protected Shape(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}






