import java.util.Objects;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;

    public Pet(Species species, String nickname, int age, int trickLevel) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
    }

    @Override
    public String toString() {
        return String.format("Pet{species=%s, nickname='%s', age=%d, trickLevel=%d}",
                species, nickname, age, trickLevel);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pet)) return false;
        Pet pet = (Pet) obj;
        return age == pet.age && trickLevel == pet.trickLevel &&
                species == pet.species && Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel);
    }
}
