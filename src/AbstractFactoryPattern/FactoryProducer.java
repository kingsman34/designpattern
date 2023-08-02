package AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String name){
        if(name.equalsIgnoreCase("shape"))
            return new ShapeFactory();
        else if (name.equalsIgnoreCase("color"))
            return new ColorFactory();
        return null;
    }
}
