
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



