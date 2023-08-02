package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("circle"))
            return new Circle();
        else if(shape.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        return null;
    }
    public Color getColor(String color){
        return null;
    }
}
