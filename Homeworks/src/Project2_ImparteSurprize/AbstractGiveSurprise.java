package Project2_ImparteSurprize;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprise {
    private final IBag bag;
    private final int waitTime;

    public AbstractGiveSurprise(String type, int waitTime){
        BagFactory bagFactory = BagFactory.getBagFactory();
        this.bag = bagFactory.makeBag(type);
        this.waitTime = waitTime;
    }

    public void put(ISurprise newSurprise){
        bag.put(newSurprise);
    }

    public void put(IBag surprises){
        bag.put(surprises);
    }

    public void give(){
        ISurprise surprise = bag.takeOut();//bag.takeOut imi returneaza o surpriza
        surprise.enjoy();
    }

    public void giveAll(){
        for (int i = 0; i < bag.size(); i++){
            bag.getBagArray().get(i).enjoy(); //ofer surprizele
            sleep(waitTime);

            bag.getBagArray().remove(i); //le sterg din arraylist
        }

    }

    public void sleep (int waitTime) {
        try {
            TimeUnit.SECONDS.sleep(10); // number of seconds to sleep
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boolean isEmpty(){
        return bag.size() == 0;
    }

    public abstract void giveWithPassion();

}
