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

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = new DayOfWeek[7][];
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father) {
        this(name, surname, year, iq);
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet);
        } else {
            System.out.println("I don't have a pet.");
        }
    }

    public void describePet() {
        if (pet != null) {
            System.out.println("I have a " + pet.getClass().getSimpleName() + " named " + pet.toString());
        } else {
            System.out.println("I don't have a pet to describe.");
        }
    }

    public void feedPet(boolean isTimeToFeed) {
        if (pet != null) {
            if (isTimeToFeed) {
                System.out.println("Hm... I will feed " + pet);
            } else {
                System.out.println("I think " + pet + " is not hungry.");
            }
        } else {
            System.out.println("I don't have a pet to feed.");
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname +
                "', year=" + year + ", iq=" + iq + "}";
    }



}
