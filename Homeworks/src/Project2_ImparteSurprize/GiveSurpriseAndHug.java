package Project2_ImparteSurprize;

public class GiveSurpriseAndHug extends AbstractGiveSurprise{

    public GiveSurpriseAndHug(String type, int waitTime){
        super(type,waitTime);
    }

    @Override
    public void giveWithPassion(){
        System.out.println("Warm wishes and a big hug!");
    }

}
