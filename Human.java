package happy_family4;

import java.util.Arrays;
public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int year, int IQ, String[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = IQ;
        this.schedule = schedule;
        this.family = family;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human() {}

    public void greetPet() {
        if (family != null && family.getPet() != null) {
            System.out.println("Hello, " + family.getPet().getNickname());
        } else {
            System.out.println("I have no pet to greet.");
        }
    }

    public void describePet() {
        if (family != null && family.getPet() != null) {
            Pet pet = family.getPet();
            System.out.println("I have a " + pet.getSpecies() + ", it is " + pet.getAge() + " years old, " +
                    "he is " + ((pet.getAge() > 50) ? "very sly" : "almost not sly"));
        } else {
            System.out.println("I have no pet to describe.");
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year +
                ", iq=" + iq + ", schedule=" + Arrays.deepToString(schedule) + "}";
    }

    public void finalize() {
        System.out.println("Cleaning up resources for " + name);
    }
}