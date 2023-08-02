package FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String name){
        if(name == null){
            return null;
        }
        if(name.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if(name.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if(name.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        return null;
    }
}
