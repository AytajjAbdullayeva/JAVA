
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


class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println(brand + " car moves with this  speed -->" + speed );
    }

    public void honk() {
        System.out.println(brand + " gave a signal: Bip bip!");
    }
}


class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void move() {
        System.out.println(brand + " bicycle moves with this speed. " + speed );
    }

    public void ringBell() {
        System.out.println(brand + " rong: Ching Ching!");
    }
}



