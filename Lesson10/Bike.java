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
