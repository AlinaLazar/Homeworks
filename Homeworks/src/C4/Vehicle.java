package C4;

import java.util.ArrayList;
import java.util.Arrays;

public class Vehicle {

    private static final String producedBy = "Volkswagen";
    private static int productionYear;
    private static String vin;
    private String plateNumber;
    private double kilometers;
    public int lastSoldOnYear;
    private double positionX;
    private double positionY;
    public String help;

    //2.c
    public String getVin() {
        return vin;
    }

    public int getProductionYear() {
        return productionYear;
    }

    //2.d
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    //2.e
    public double getKilometers() {
        return kilometers;
    }

    //2.f
    public Vehicle (int productionYear) {
        this.productionYear = productionYear;
    }

    public Vehicle (int productionYear, String vin, String plateNumber) {
        this(productionYear);
        this.vin = vin;
        this.plateNumber = plateNumber;
    }

    public Vehicle (int productionYear, String vin, String plateNumber, int kilometers) {
        this(productionYear, vin, plateNumber);
        this.kilometers = kilometers;
    }

    //3.a
    public void sellVehicle (String plateNumber, int lastSoldOnYear) {
        this.plateNumber = plateNumber;
        this.lastSoldOnYear = lastSoldOnYear;
    }

    //3.b
    public void moveVehicle (double newPositionX, double newPositionY) {

        double v1 = Math.pow((this.positionX - newPositionX), 2);
        double v2 = Math.pow((this.positionY - newPositionY), 2);
        double distance = (double) Math.sqrt(v1 + v2);
        this.kilometers += distance;
        this.positionX = newPositionX;
        this.positionY = newPositionY;

    }

    //3.c
    public boolean isVinValid (boolean isDrivingInNorthAmerica) {
        if (isDrivingInNorthAmerica == false) {
            return true;
        }
        if (isDrivingInNorthAmerica == true){
            if ((this.vin.length() == 17) && (productsOfTransliterateAndWeight(vin) % 11 == 10) && vin.charAt(8) == 'X'){
                return true;
            }else {
                return false;  //?????????
            }
        }
        return true;
    }



    public ArrayList<Integer> transliterateVinNumber (String vin){
        char [] vinNumberChars = vin.replaceAll("-", "0").replaceAll(" ", "").toUpperCase().toCharArray();
        int transliterateValue = 0;
        ArrayList<Integer> transliterateValueArr = new ArrayList<Integer>();
        for (int i = 0; i < vinNumberChars.length; i++ ){
            transliterateValue = transliterate(vinNumberChars[i]);
            transliterateValueArr.add(transliterateValue);
        }

        return transliterateValueArr;
    }

    private static int transliterate(char check){
        if(Character.isLetter(check)) {
            if (check == 'A' || check == 'J') {
                return 1;
            } else if (check == 'B' || check == 'K' || check == 'S') {
                return 2;
            } else if (check == 'C' || check == 'L' || check == 'T') {
                return 3;
            } else if (check == 'D' || check == 'M' || check == 'U') {
                return 4;
            } else if (check == 'E' || check == 'N' || check == 'V') {
                return 5;
            } else if (check == 'F' || check == 'W') {
                return 6;
            } else if (check == 'G' || check == 'P' || check == 'X') {
                return 7;
            } else if (check == 'H' || check == 'Y') {
                return 8;
            } else if (check == 'R' || check == 'Z') {
                return 9;
            }
        }
        if (Character.isDigit(check)){
            return Character.getNumericValue(check);
        }
        return -1;
    }

   public int productsOfTransliterateAndWeight (String vin) {
        int sum = 0;
        ArrayList<Integer> weight = new ArrayList<>(Arrays.asList(8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2));
        ArrayList<Integer> transliterateValue = transliterateVinNumber(vin);

        ArrayList <Integer> products = new ArrayList<Integer>();

        for ( int i = 0; i < weight.size(); i++){
            products.add(weight.get(i)* transliterateValue.get(i));
            sum += products.get(i);
        }

        return sum;
   }




   //3.d
    public void printVinDecomposed(String vin){
        System.out.println("Identificatorul producatorului: " + vin.substring(0,3));
        System.out.println("Atributele vehiculului: " + vin.substring(3,8));
        System.out.println("Cifra de verificare: " + vin.substring(8,9));
        System.out.println("Anul productiei modelului: " + vin.substring(9,10));
        System.out.println("Seria fabricii: " + vin.substring(10,11));
        System.out.println("Identificatorul numeric: " + vin.substring(11,17));
    }

    //3.e
    public void display() {
        System.out.println("Masina cu nr: " + this.plateNumber
                + " a fost produsa de catre " + this.producedBy
                + " in anul " + this.productionYear
                + " are nr km = " + this.kilometers
                + " si a fost vanduta ultima oara in " + this.lastSoldOnYear
                + " iar momentan se afla in pozitia " + this.positionX + " " + this.positionY);
    }

}
