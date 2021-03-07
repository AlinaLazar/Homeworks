package Project2_ImparteSurprize;
import java.util.Objects;

public class FIFOBag extends Bag {

    public FIFOBag(){
    }

    @Override
    public ISurprise takeOut(){
        if (super.bag.size() == 0){
            System.out.println("There are no surprises in this bag!");
        }
        int index = 0;
        ISurprise returnedSurprise = super.bag.get(index);
        super.bag.remove(index);
        return returnedSurprise;
    }

    @Override
    public String toString() {
        return "Tolba FIFO cu " + super.bag.size()+ " surprize";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FIFOBag)) return false;
        if (!super.equals(o)) return false;
        FIFOBag fifoBag = (FIFOBag) o;
        return Objects.equals(bag, fifoBag.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), super.bag);
    }
}
