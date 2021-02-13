package C12AbstractClasses;

public class Tiger extends Terrestrial{
    public Tiger (boolean carnivore, int weight, int size, String species, int legs, int eyes) {
        super(carnivore, weight, size, species, legs, eyes);
    }

    @Override
    public void eat (int unitsOfFood){
        System.out.println("Eating like a tiger: " + unitsOfFood + " deers");
    }

    @Override
    public void move(int distance){
        System.out.println("Quickly moving forward like a tiger, " + distance + " meters ");
    }

    @Override
    public void saySomething(){
        System.out.println("Ggggrrrr... This tiger says something...");
    }
    @Override
    public void specialCharacteristic() {
        System.out.println("I am a perfect hunter - agile and precise!");
    }
}
