package Project2_ImparteSurprize;

public class Main {
    public static void main(String[] args) {

        FortuneCookie cookie = FortuneCookie.generate();
        cookie.enjoy();

        Candies candy = Candies.generate();
        candy.enjoy();

        MinionToy minionToy = MinionToy.generate();
        minionToy.enjoy();

        Bag lifoBag = new LIFOBag();  //???
        lifoBag.put(cookie);
        lifoBag.put(candy);
        lifoBag.put(minionToy);
        System.out.println(lifoBag.isEmpty());
        System.out.println(lifoBag.size());
        System.out.println(lifoBag.getBagArray());
        lifoBag.takeOut();
        System.out.println(lifoBag.size());
        System.out.println(lifoBag.getBagArray());

        Bag fifoBag = new FIFOBag();
        fifoBag.put(cookie);
        fifoBag.put(candy);
        fifoBag.put(minionToy);
        System.out.println(fifoBag.isEmpty());
        System.out.println(fifoBag.size());
        System.out.println(fifoBag.getBagArray());
        fifoBag.takeOut();
        System.out.println(fifoBag.size());
        System.out.println(fifoBag.getBagArray());

        Bag randomBag = new RandomBag();
        randomBag.put(cookie);
        randomBag.put(candy);
        randomBag.put(minionToy);
        System.out.println(randomBag.isEmpty());
        System.out.println(randomBag.size());
        System.out.println(randomBag.getBagArray());
        randomBag.takeOut();
        System.out.println(randomBag.size());
        System.out.println(randomBag.getBagArray());

        BagFactory factory = new BagFactory();
        factory.makeBag("random");

        GiveSurpriseAndApplause surprise1 = new GiveSurpriseAndApplause("lifo", 30);
        surprise1.put(cookie);
        surprise1.give();
        surprise1.giveWithPassion();

    }
}
