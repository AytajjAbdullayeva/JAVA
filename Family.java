package happy_family4;
import java.lang.ref.Cleaner;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }
    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void deleteChild(int index) {
        if (index >= 0 && index < children.length) {
            Human[] newChildren = new Human[children.length - 1];
            for (int i = 0, j = 0; i < children.length; i++) {
                if (i != index) {
                    newChildren[j++] = children[i];
                }
            }
            children = newChildren;
        }
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public Human bornChild() {
        Random random = new Random();
        String[] boyNames = {"John", "Michael", "David"};
        String[] girlNames = {"Emma", "Sophia", "Olivia"};
        boolean isBoy = random.nextBoolean();
        String childName = isBoy ? boyNames[random.nextInt(boyNames.length)] : girlNames[random.nextInt(girlNames.length)];
        int avgIq = (mother.getIq() + father.getIq()) / 2;
        return isBoy ? new Man(childName, father.getSurname(), 2025, avgIq, null, this) :
                new Woman(childName, father.getSurname(), 2025, avgIq, null, this);
    }
}