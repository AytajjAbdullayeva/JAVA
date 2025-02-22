import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private Map<DayOfWeek, String> schedule;

    public Human(String name, String surname, int year, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, schedule=%s}",
                name, surname, year, schedule);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Human)) return false;
        Human human = (Human) obj;
        return year == human.year &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }
}
