package C11CompunereAgregare;

public class TestDevices {
    public static void main(String[] args) {

        Screen aPhoneScreen = new Screen(20, 12, 15, 5);
        Case aPhoneCase = new Case();
        Speaker aPhoneSpeaker = new Speaker(100, 20);
        Microphone aPhoneMicrophone = new Microphone(100, 10);
        Smartphone smartphone = new Smartphone(2, 12, 15, 5, 100,
                20, 80, 30);


        System.out.println(smartphone);

        //testing Smartphone
        smartphone.pressVolumeDown();
//        smartphone.pressVolumeUp();
//
//        smartphone.setPixel(1,"red");
//        smartphone.colorScreen("green");
//        smartphone.increaseMicrophoneVolume();
//        smartphone.decreaseMicrophoneVolume();
//
//
       System.out.println(smartphone);
//
//        smartphone.muteMicrophone();
       smartphone.setSilenceMode();
//
       System.out.println(smartphone);

        //testing toString
//        System.out.println(aPhoneScreen);
//        System.out.println(aPhoneSpeaker);
//        System.out.println(aPhoneMicrophone);
//       System.out.println(smartphone);

        //testing equals
        Smartphone smartphone1 = new Smartphone(3, 10,8,4,80,35,85,25);
        Smartphone smartphone2 = new Smartphone(3,10,8,4,80,35,85,25);
        System.out.println(smartphone.equals(smartphone1));
        System.out.println(smartphone1.equals(smartphone2));

        //testing hashcode
        System.out.println(smartphone.hashCode());
        System.out.println(smartphone1.hashCode());
        System.out.println(smartphone2.hashCode());
    }
}
