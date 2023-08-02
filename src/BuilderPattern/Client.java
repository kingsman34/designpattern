package BuilderPattern;

public class Client {
    public static void main(String[] args){
        Builder builder = new CarBuilder();
        Car car = (Car)builder.id(1).height(5).brand("Lambo").color("Red").engine("HP").model("Avandator").numberOfDoors(2).build();

        System.out.println(car.toString());

        Director director = new Director();
        Builder builder1 = new CarBuilder();
        director.buildBugatti(builder1);
        builder1.color("red");
        builder1.numberOfDoors(2);
        car = (Car)builder1.build();

        System.out.println(car.toString());

    }
}
