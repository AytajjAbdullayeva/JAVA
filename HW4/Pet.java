package happy_family4;
import java.lang.ref.Cleaner;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

abstract class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private Species species;

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.species = Species.UNKNOWN;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public Species getSpecies() {
        return species;
    }
}