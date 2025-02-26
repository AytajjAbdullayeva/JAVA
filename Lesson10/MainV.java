
public class MainV {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120, 4);
        Bike bike = new Bike("Giant", 25, true);

        car.startEngine();
        car.move();
        car.honk();

        System.out.println("--------------------");

        bike.startEngine();
        bike.move();
        bike.ringBell();
    }
}
