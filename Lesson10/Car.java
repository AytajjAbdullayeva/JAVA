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
