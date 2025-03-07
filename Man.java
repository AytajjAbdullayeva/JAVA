package happy_family4;
final class Man extends Human {
    public Man(String name, String surname, int year, int iq, String[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey buddy! How are you?");
    }

    public void repairCar() {
        System.out.println("I am repairing my car");
    }
}
