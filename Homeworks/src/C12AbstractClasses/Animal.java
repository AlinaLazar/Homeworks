package C12AbstractClasses;

public abstract class Animal {
    // The class has 4 fields:
    private boolean carnivore;
    private int weight;
    private int size;
    private String species;

    // The class has 1 constructor:
    public Animal(boolean carnivore, int weight, int size, String species) {
        this.carnivore = carnivore;
        this.weight = weight;
        this.size = size;
        this.species = species;
    }

    //metode abstracte
    public abstract void eat(int foodQuantity);

    public abstract void move(int distance);

}
