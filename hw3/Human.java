class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private DayOfWeek[][] schedule;
    private Family family;

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = new DayOfWeek[7][];
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father) {
        this(name, surname, year, iq);
        this.mother = mother;
        this.father = father;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet);
    }

    public void describePet() {
        System.out.println("I have a " + pet.getClass().getSimpleName() + " named " + pet.toString());
    }

    public void feedPet(boolean isTimeToFeed) {
        if (isTimeToFeed) {
            System.out.println("Hm... I will feed " + pet);
        } else {
            System.out.println("I think " + pet + " is not hungry.");
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + "}";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human object is being deleted: " + this);
        super.finalize();
    }
}
