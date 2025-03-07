package happy_family4;

final class Woman extends Human {
    public Woman(String name, String surname, int year, int iq, String[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello my lovely pet!");
    }

    public void doMakeup() {
        System.out.println("I am doing my makeup");
    }
}
