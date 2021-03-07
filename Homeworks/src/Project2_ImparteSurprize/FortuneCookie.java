package Project2_ImparteSurprize;
import java.util.ArrayList;
import java.util.Objects;

public class FortuneCookie implements ISurprise {
    private final String message;

    public FortuneCookie(String message) {
        this.message = message;
    }

    @Override
    public void enjoy() {
        System.out.println("SURPRISE! FortuneCookie: " + this.message);
    }

    public static FortuneCookie generate() {

        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("\"Nothing is impossible, the word itself says, ‘I'm possible!'\" -Audrey Hepburn");
        quotes.add("\"The question isn't who is going to let me; it's who is going to stop me.\" -Ayn Rand");
        quotes.add("\"The only person you are destined to become is the person you decide to be.\" -Ralph Waldo Emerson");
        quotes.add("\"Believe you can and you're halfway there.\" -Theodore Roosevelt");
        quotes.add("\"You miss 100% of the shots you don't take.\" -Wayne Gretzky");
        quotes.add("\"I alone cannot change the world, but I can cast a stone across the water to create many ripples.\" " +
                "-Mother Teresa");
        quotes.add("\"If you are not willing to risk the usual, you will have to settle for the ordinary.\" -Jim Rohn");
        quotes.add("\"The only place where success comes before work is in the dictionary.\" -Vidal Sassoon");
        quotes.add("\"Don't be afraid to give up the good to go for the great.\" -John D. Rockefeller");
        quotes.add("\"Try not to become a man of success. Rather become a man of value.\" -Albert Einstein");
        quotes.add("\"It is better to fail in originality than to succeed in imitation.\" -Herman Melville");
        quotes.add("\"I never dreamed about success, I worked for it.\" -Estee Lauder");
        quotes.add("\"You have brains in your head. You have feet in your shoes. You can steer yourself any direction " +
                "you choose.\" -Dr. Seuss");
        quotes.add("\"Life itself is the most wonderful fairy tale.\" -Hans Christian Andersen");
        quotes.add("\"Winning isn't everything, but wanting to win is.\" -Vince Lombardi");
        quotes.add("\"I didn't fail the test. I just found 100 ways to do it wrong.\" -Benjamin Franklin");
        quotes.add("\"If you're offered a seat on a rocket ship, don't ask what seat! Just get on.\" -Sheryl Sandberg");
        quotes.add("\"Dreaming, after all, is a form of planning.\" -Gloria Steinem");
        quotes.add("\"Too many of us are not living our dreams because we are living our fears.\" -Les Brown");
        quotes.add("\"It does not matter how slowly you go as long as you do not stop.\" -Confucius");

        int rnd = random.nextInt(20);

        System.out.println("Fortune cookie suprise added to bag!");
        return new FortuneCookie(quotes.get(rnd));
    }

    @Override
    public String toString() {
        return "FortuneCookie{" +
                "message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FortuneCookie)) return false;
        FortuneCookie that = (FortuneCookie) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
