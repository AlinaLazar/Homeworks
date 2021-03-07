package Project2_ImparteSurprize;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Bag implements IBag{

    public ArrayList<ISurprise> bag = new ArrayList<>();

    public Bag(){
    }

    @Override
    public void put (ISurprise newSurprise){
        System.out.println("Adauga surprize");
        bag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises){
        System.out.println("Adauga tolba");
        bag.addAll(bagOfSurprises.getBagArray());
        for (int i = 0; i <= bagOfSurprises.getBagArray().size(); i++){
            bagOfSurprises.getBagArray().remove(i);
        }
    }

    @Override
    public abstract ISurprise takeOut();

    @Override
    public boolean isEmpty(){
        return (bag.size() == 0);
    }

    @Override
    public int size(){
        return bag.size();
    }

    @Override
    public ArrayList<ISurprise> getBagArray(){
        return this.bag;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "bag=" + bag +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bag)) return false;
        Bag bag1 = (Bag) o;
        return Objects.equals(bag, bag1.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bag);
    }
}
