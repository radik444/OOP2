
public class Main {
    public static void main(String[] args) {
        Car car = new Car("model1",4);
        Car car2 = new Car("model2",6);


        Truck truck = new Truck("truck1",10);
        Truck truck2 = new Truck("truck2",12);


        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",4);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check( bicycle2);
        station.check( truck);
        station.check(truck2);
    }
}