package C12AbstractClasses;

public class Main {
    public static void main(String[] args) {
       // Terrestrial aTerrestrialAnimal = new Terrestrial (true,30,20,"monkey");

        Rhino rhino = new Rhino (false, 100,80, "Greater one-horned rhino",4,2);
        rhino.eat(5);
        rhino.move(10);

        Animal rhnio1 = new Rhino (false, 80,75,"White rhino", 4,2);
        rhnio1.eat(2);
        rhnio1.move(30);

    }
}
