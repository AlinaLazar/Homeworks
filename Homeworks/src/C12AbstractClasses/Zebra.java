package C12AbstractClasses;

public class Zebra extends Terrestrial {

    public Zebra(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
        super(carnivore, weight, size, species, legs, eyes);
    }

    @Override
    public void eat (int unitsOfFood){
        System.out.println("Eating grass like a zebra, " + unitsOfFood + " tons.");
    }

    @Override
    public void move(int distance){
        System.out.println("Quickly moving forward like a zebra, " + distance + " meters in " + distance / 2 + " days.");
    }

    @Override
    public void saySomething() {
        System.out.println("Wzzeeaaaa... This zebra says something...");
    }

    @Override
    public void specialCharacteristic(){
        System.out.println("I have particular stripes!");
    }

}
