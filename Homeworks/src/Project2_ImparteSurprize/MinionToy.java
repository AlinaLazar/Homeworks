package Project2_ImparteSurprize;
import java.util.ArrayList;
import java.util.Objects;

public class MinionToy implements ISurprise {

    private final String minionName;
    private static int minionCounter = 0;

    public MinionToy(String minionName) {
        this.minionName = minionName;
    }

    @Override
    public void enjoy() {
        System.out.println("SURPRISE! You got a minion toy, name: " + minionName);
    }


    public static MinionToy generate() {
        ArrayList<String> minionToys = new ArrayList<>();
        minionToys.add("Dave");
        minionToys.add("Carl");
        minionToys.add("Kevin");
        minionToys.add("Stuart");
        minionToys.add("Jerry");
        minionToys.add("Tim");

        if (minionCounter >= minionToys.size()) {
            minionCounter = 0;
            minionCounter++;
        }
        System.out.println("Minion toy suprise added to bag!");

        return new MinionToy(minionToys.get(minionCounter));
    }

    @Override
    public String toString() {
        return "MinionToy{" +
                "minionName='" + minionName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MinionToy)) return false;
        MinionToy minionToy = (MinionToy) o;
        return Objects.equals(minionName, minionToy.minionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minionName);
    }
}

