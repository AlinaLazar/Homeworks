package Project2_ImparteSurprize;


public class Candies implements ISurprise {

    private static int candiesNo;
    private static EnumCandyType candiesType;

    public Candies(int candiesNo, EnumCandyType candiesType) {
        this.candiesNo = candiesNo;
        this.candiesType = candiesType;

    }

    @Override
    public void enjoy() {
        System.out.println("SURPRISE! You got: " + candiesNo + " " + candiesType + " candies!");

    }

    public static Candies generate() {

        candiesNo = random.nextInt(100);
        int candyTypeIndex = random.nextInt(4);
        candiesType = EnumCandyType.values()[candyTypeIndex];

        System.out.println("Candies suprise added to bag!");

        return new Candies(candiesNo, candiesType);
    }

    @Override
    public String toString() {
        return "Candies{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}


