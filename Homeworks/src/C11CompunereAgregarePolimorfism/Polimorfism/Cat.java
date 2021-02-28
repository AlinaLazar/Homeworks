package C11CompunereAgregarePolimorfism.Polimorfism;

public class Cat extends DomesticAnimal{

    public Cat(int size, int height, String species){
        super (size, height, species);
    }

    @Override
    public void eat (int food){
        System.out.println("a cat eats " + food + " units of food per day" );
    }

}
