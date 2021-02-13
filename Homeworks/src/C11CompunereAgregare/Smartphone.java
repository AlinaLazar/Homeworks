package C11CompunereAgregare;

import java.util.Objects;

public class Smartphone {

    private Screen theScreen;
    private Case theCase;
    private Speaker theSpeaker;
    private Microphone theMicrophone;

    public Smartphone(int pixelsNo, int width, int length, int depth, int maxVolume,
                      int crtVolume, int maxMicroVolume, int crtMicroVolume) {
        this.theScreen = new Screen(pixelsNo, width, length, depth);
        this.theCase = new Case();
        this.theSpeaker = new Speaker(maxVolume, crtVolume);
        this.theMicrophone = new Microphone(maxMicroVolume, crtMicroVolume);
    }

    public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, int microMaxVol) {
        this.theScreen = new Screen(pixelsNo, width, length, depth);
        this.theCase = new Case();
        this.theSpeaker = new Speaker(speakerMaxVol);
        this.theMicrophone = new Microphone(microMaxVol);
    }


    public void pressVolumeUp() {
        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressVolumeUp();

        System.out.println("class Smartphone: delegate to Speaker ->");
        this.theSpeaker.increaseVolume();
    }

    public void pressVolumeDown() {
        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressVolumeDown();

        System.out.println("class Smartphone: delegate to Speaker ->");
        this.theSpeaker.decreaseVolume();
    }

    public void setPixel(int pixelsNo, String color) {
        System.out.println("class Smartphone: delegate to Screen ->");
        this.theScreen.setPixel(pixelsNo, color);
    }

    public void colorScreen(String color) {
        System.out.println("class Smartphone: delegate to Screen ->");
        this.theScreen.colorScreen(color);
    }

    public void increaseMicrophoneVolume() {
        System.out.println("class Smartphone: delegate to Microphone ->");
        this.theMicrophone.increaseVolume();
    }

    public void decreaseMicrophoneVolume() {
        System.out.println("class Smartphone: delegate to Microphone ->");
        this.theMicrophone.decreaseVolume();

    }

    public void muteMicrophone() {
        System.out.println("class Smartphone: delegate to Microphone ->");
        this.theMicrophone.muteMicrophone();
    }

    public void setSilenceMode() {
        System.out.println("class Smartphone: delegate to Speaker ->");
        this.theSpeaker.setSilenceMode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "theScreen=" + theScreen +
                ", theCase=" + theCase +
                ", theSpeaker=" + theSpeaker +
                ", theMicrophone=" + theMicrophone +
                '}';
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Smartphone other = (Smartphone) obj;
        return Objects.equals(theScreen, other.theScreen) && Objects.equals(theSpeaker, other.theSpeaker) &&
                Objects.equals(theMicrophone, other.theMicrophone);
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + (theScreen == null ? 0 : theScreen.hashCode());
        result = prime * result + (theSpeaker == null ? 0 : theSpeaker.hashCode());
       // result = prime * result + (theCase == null ? 0 : theCase.hashCode());
        result = prime * result + (theMicrophone == null ? 0 : theMicrophone.hashCode());
        return result;
    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(theScreen,theCase, theSpeaker, theMicrophone);
//    }
}
