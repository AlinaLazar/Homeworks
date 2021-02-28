package C11CompunereAgregarePolimorfism.Polimorfism;

public class DomesticAnimal {
    private int size;
    private int height;
    private String species;

    public DomesticAnimal(int size, int height, String species){
        this.size = size;
        this.height = height;
        this.species = species;
    }

    public void eat (int food){
        System.out.println("this animal eats " + food + " units of food per day");
    }

}
