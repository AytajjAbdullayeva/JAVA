package happy_family4;

public class Main {
    public static void main(String[] args) {
        Woman mother = new Woman("Nora", "Nehgomayer", 1980, 120, null, null);
        Man father = new Man("Michael", "Michelle", 1990, 130, null, null);
        Family family = new Family(mother, father);
        String[][] activities = {{DayOfWeek.Monday.name(), "Swimming"}, {DayOfWeek.Saturday.name(), "Reading"}};
        Human child = new Human("Jack", "Nehgomayer", 2003, 200, activities, family);
        family.setChildren(new Human[]{child});
        System.out.println("Family before deletion:");
        System.out.println(family.toString());
        family.deleteChild(0);
        System.out.println("Family after deletion:");
        System.out.println(family.toString());
    }
}
