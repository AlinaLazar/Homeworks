package C11CompunereAgregare;

public class Speaker {
    private int maxVolume;
    private int crtVolume;

    public Speaker(int maxVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = 25 / 100 * this.maxVolume;
    }

    public Speaker(int maxVolume, int crtVolume) {
        this(maxVolume);
        this.crtVolume = crtVolume;
    }

    public boolean increaseVolume() {
        System.out.println("The volume is increased!");
        if (this.crtVolume < this.maxVolume) {
            crtVolume +=1;
            return true;
        }
        return false;
    }

    public boolean decreaseVolume() {
        System.out.println("The volume is decreased!");
        if (this.crtVolume > 0) {
            crtVolume -= 1;
            return true;
        }
        return false;
    }

    public void setSilenceMode() {
        System.out.println("The speaker is on silent mode!");
        this.crtVolume = 0;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "maxVolume=" + maxVolume +
                ", crtVolume=" + crtVolume +
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
        Speaker other = (Speaker) obj;
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

