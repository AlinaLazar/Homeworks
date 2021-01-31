package C4;

public class C4VehicleMain {

    public static void main(String[] args) {
        Vehicle carA = new Vehicle(2015, "1M8GDM9AXKP042788", "B90MPO");
        Vehicle carB = new Vehicle(2018, "ABC", "CJ12CTA");

        carA.sellVehicle("BH89FOC", 2016);

        System.out.println("CarA are plate number: " + carA.getPlateNumber() + " si ultima data a fost vanduta in anul "
                + carA.lastSoldOnYear);

        carA.moveVehicle(2.0,4.5);

        carA.printVinDecomposed("1M8GDM9AXKP042788");


        System.out.println(carB.transliterateVinNumber("1M8GDM9APKP042798"));
        System.out.println(carB.productsOfTransliterateAndWeight("1M8GDM9APKP042798"));

        System.out.println(carB.isVinValid(true));

        carA.display();
    }

}
