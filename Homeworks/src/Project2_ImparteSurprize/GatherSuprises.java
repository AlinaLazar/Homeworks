package Project2_ImparteSurprize;
import java.util.Random;
import java.util.ArrayList;

public final class GatherSuprises {
    private static final Random random = new Random();
    public static ArrayList<ISurprise> surprisesArray;

    private GatherSuprises(){
    }

    public static ArrayList<ISurprise> gather(int n){

        surprisesArray = new ArrayList<ISurprise>(n);
        for (int i = 0; i < n; i++){
            surprisesArray.add(gather());
        }
        return surprisesArray;
    }

    public static ISurprise gather(){
        int rnd = random.nextInt(2);
        ISurprise surprise = null;
        switch(rnd){
            case (0):
                surprise = FortuneCookie.generate();
                break;
            case(1):
                surprise = Candies.generate();
                break;
            case(2):
                surprise = MinionToy.generate();
                break;
            default:
                System.out.println("there is no surprise!");
        }
        return surprise;
    }
}
