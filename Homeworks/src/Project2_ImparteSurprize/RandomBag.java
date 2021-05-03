package Project2_ImparteSurprize;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class RandomBag extends Bag{

    public RandomBag(){
    }

    Random rnd = new Random();

    @Override
    public ISurprise takeOut(){
        if (super.bag.size() == 0){
            System.out.println("There are no surprises in this bag!");
        }
        int index = rnd.nextInt(super.bag.size());
        ISurprise returnedSurprise = super.bag.get(index);
        super.bag.remove(index);
        return returnedSurprise;
    }

    @Override
    public String toString() {
        return "Tolba Random cu " + super.bag.size()+ " surprize";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RandomBag)) return false;
        if (!super.equals(o)) return false;
        RandomBag randomBag = (RandomBag) o;
        return Objects.equals(bag, randomBag.bag) && Objects.equals(rnd, randomBag.rnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), super.bag, rnd);
    }
}
