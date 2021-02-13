package C11CompunereAgregare;

public class Microphone {
    private int maxVolume;
    private int crtVolume;

    public Microphone(int maxVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = 25 / 100 * this.maxVolume;
    }

    public Microphone(int maxVolume, int crtVolume) {
        this(maxVolume);
        this.crtVolume = crtVolume;
    }

    public boolean increaseVolume() {

        if (this.crtVolume < this.maxVolume) {
            System.out.println("The volume is increased!");
            crtVolume +=1;
            return true;
        }
        return false;
    }

    public boolean decreaseVolume() {

        if (this.crtVolume > 0) {
            System.out.println("The volume is decreased!");
            this.crtVolume -= 1;
            return true;
        }
        return false;
    }

    public void muteMicrophone() {
        System.out.println("The microphone is on mute!");
        this.crtVolume = 0;
    }

    @Override
    public String toString() {
        return "Microphone{" +
                "maxVolume=" + this.maxVolume +
                ", crtVolume=" + this.crtVolume +
                '}';
    }
    @Override
    public boolean equals (Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Microphone other = (Microphone) obj;
        if (this.maxVolume == other.maxVolume && this.crtVolume == other.crtVolume){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + maxVolume;
        result = prime * result + crtVolume;
        return result;
    }
}
