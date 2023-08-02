package BuilderPattern;

public class CarSchema {
    private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int numberOfDoors;


    public CarSchema(int id, int height, String brand, String model, String color, String engine, int numberOfDoors) {
        this.id = id;
        this.height = height;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    public String toString() {
        return """
                Car {
                    id=%s,
                    height=%s,
                    brand=%s,
                    model=%s,
                    color=%s,
                    engine=%s,
                    nbrOfDoors=%s
                }""".formatted(id, height, brand, model, color, engine, numberOfDoors);
    }
}
