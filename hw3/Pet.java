class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private Species species;

    public Pet(String nickname, Species species) {
        this.nickname = nickname;
        this.species = species;
        this.habits = new String[]{};
    }

    public Pet(String nickname, int age, int trickLevel, Species species, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.species = species;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return species + " {nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + java.util.Arrays.toString(habits) + "}";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pet object is being deleted: " + this);
        super.finalize();
    }
}
