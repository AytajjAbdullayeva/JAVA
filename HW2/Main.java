public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "Doe", 1975);
        Human father = new Human("John", "Doe", 1973);
        Family family = new Family(mother, father);

        Pet pet = new Pet("dog", "Bud", 5, 80, new String[]{"eat", "play", "sleep"});
        family.setPet(pet);

        Human child = new Human("Aytan", "Dore", 2000, 90, new String[][]{{"Monday", "Gym"}}, family);
        family.addChild(child);

        System.out.println(family);
        child.greetPet();
        child.describePet();
    }
}
