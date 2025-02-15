import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    static {
        System.out.println("Family class loaded");
    }

    {
        System.out.println("New Family object created");
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public Human getMother() { return mother; }
    public void setMother(Human mother) { this.mother = mother; }

    public Human getFather() { return father; }
    public void setFather(Human father) { this.father = father; }

    public Human[] getChildren() { return children; }
    public void setChildren(Human[] children) { this.children = children; }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }

    public void addChild(Human child) {
        child.setFamily(this);
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;
        children = newChildren;
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) return false;
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) newChildren[j++] = children[i];
        }
        children = newChildren;
        return true;
    }

    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public String toString() {
        return "Family{mother=" + mother + ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}

