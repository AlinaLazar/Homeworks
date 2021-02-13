package C8;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("3FDS9DFF8FSD7", 4, "Moby");
        vehicle1.goTo(1.2,3.4);
        vehicle1.printInfo();

        OnRoad automobile = new OnRoad("FDFL8KMFSDLKM6", 2, "Sporty", 2, 4);
        automobile.goTo(1.3,4.5);
        automobile.addFuel(23.4);
        automobile.printInfo();

        OnWater ship = new OnWater("F8GFDG86D87GGD", 20, "Wavess", 2, 2000.00);
        ship.goTo(3.5,5.6);
        ship.addFuel(345.1);
        ship.printInfo();

        OnAir airplane = new OnAir("GJR96GDF98DF9ND", 120,"Bluesky", 4, true);
        OnAir airplane2 = new OnAir("BC325987DFKJS34", 20, "Localsky", 2, false);
        airplane.goTo(3.4, 6.7);
        airplane.addFuel(45.67);
        airplane.printInfo();
        airplane2.printInfo();
        
    }
}
