
abstract class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public abstract void move();


    public void startEngine() {
        System.out.println(brand + " is starting to work. ");
    }
}







