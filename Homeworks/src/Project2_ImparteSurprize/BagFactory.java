package Project2_ImparteSurprize;
import java.util.ArrayList;

public class BagFactory implements IBagFactory{
    private static boolean exist = false;
    private static BagFactory bagFactory ;

    public BagFactory() {
    }

    public static BagFactory getBagFactory() {
        if(!exist) {
            bagFactory = new BagFactory();
            exist = true;
        }
        return bagFactory;
    }

    public IBag makeBag(String type) {
        IBag bag = null;
        switch(type) {
            case("random"):
                bag = new RandomBag();
                break;
            case("fifo"):
                bag = new FIFOBag();
                break;
            case("lifo"):
                bag = new LIFOBag();
                break;
        }
        return bag;
    }

}
