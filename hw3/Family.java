import java.util.ArrayList;
import java.util.List;

public class Family implements AutoCloseable {
    private Human mother;
    private Human father;
    private List<Human> children = new ArrayList<>();

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public boolean deleteChild(Human child) {
        return children.remove(child);
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < children.size()) {
            children.remove(index);
            return true;
        }
        return false;
    }

    public int countFamily() {
        return 2 + children.size(); // Parents + children
    }

    @Override
    public void close() {
        System.out.println("Family object is being deleted.");
    }
}
