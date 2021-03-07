package Project2_ImparteSurprize;
import java.util.ArrayList;
public interface IBag {

    void put(ISurprise newSurprise);

    void put(IBag bagOfSurprises);

    ISurprise takeOut();

    boolean isEmpty();

    int size();

    ArrayList<ISurprise> getBagArray();
}
