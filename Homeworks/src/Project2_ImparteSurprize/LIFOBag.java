package Project2_ImparteSurprize;
import java.util.Objects;

public class LIFOBag extends Bag{

    public LIFOBag(){
    }

    @Override
    public ISurprise takeOut(){
        if (super.bag.size() == 0){
            System.out.println("There are no surprises in this bag!");
        }
        int index = super.bag.size() - 1;
        ISurprise returnedSurprise = super.bag.get(index);
        super.bag.remove(index);
        return returnedSurprise;
    }

    @Override
    public String toString() {
        return "Tolba LIFO cu " + super.bag.size()+ " surprize";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LIFOBag)) return false;
        if (!super.equals(o)) return false;
        LIFOBag lifoBag = (LIFOBag) o;
        return Objects.equals(bag, lifoBag.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), super.bag);
    }
}
