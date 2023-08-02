package AbstractFactoryPattern;

public class Client {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        shape1 = shapeFactory.getShape("rectangle");
        shape1.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color1 = colorFactory.getColor("red");
        color1.fill();
        color1 = colorFactory.getColor("green");
        color1.fill();
    }

}
