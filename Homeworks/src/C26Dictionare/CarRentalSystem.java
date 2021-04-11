package C26Dictionare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CarRentalSystem {
    private static Scanner scanner = new Scanner(System.in);
    private HashMap<String, String > rentedCar = new HashMap<>(100, 0.5f);
    private HashMap<String, ArrayList<String>> carsByOwner = new HashMap<>(100,0.5f);

    private static String getPlateNo(){
        System.out.println("Introduceti numarul de inmatriculare:");
        return scanner.nextLine();
    }

    private static String getOwnerName(){
        System.out.println("Introduceti numele proprietarului:");
        return scanner.nextLine();
    }

    // search for a key in hashtable
    private boolean isCarRent(String plateNo){
        return rentedCar.containsKey(plateNo);
    }

    // get the value associated to a key
    private void getCarRent(String plateNo) {
        if (!rentedCar.containsKey(plateNo)) {
            System.out.println("Nu exista niciun proprietar cu acest numar de inmatriculare!");
        } else {
            System.out.println( rentedCar.get(plateNo));
        }
    }


    // add a new (key, value) pair
    private void rentCar (String plateNo, String ownerName){
        if(rentedCar.containsKey(plateNo)){                                    //1.1Daca ar fi adaugat un autoturism cu un nr de inmatriculare existent
            System.out.println("Eroare! Numarul de inmatriculare exista deja");     // si cu un alt proprietar , ar fi suprascris proprietarul.
        } else {
            rentedCar.put(plateNo, ownerName);
        }
        if(!carsByOwner.containsKey(ownerName)){
            carsByOwner.put(ownerName,new ArrayList<>());
        }
        carsByOwner.get(ownerName).add(plateNo);
    }

    // remove an existing (key, value) pair
    private void returnCar(String plateNo) {
        if (rentedCar.containsKey(plateNo)) {
            rentedCar.remove(plateNo);
            System.out.println("Stergerea a fost efectuata cu succes!");
        } else {
            System.out.println("Acest numar de inmatriculare nu exista in baza de date!");
        }
    }

    private ArrayList<String> getCarsList(){
        System.out.println("Introduceti numele owner-ului:");
        String ownerName = scanner.nextLine();
        return carsByOwner.get(ownerName);
    }

    private static void printCommandsList() {
        System.out.println("help         - Afiseaza aceasta lista de comenzi");
        System.out.println("add          - Adauga o noua pereche (masina, sofer)");
        System.out.println("check        - Verifica daca o masina este deja luata");
        System.out.println("remove       - Sterge o masina existenta din hashtable");
        System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
        System.out.println("getCarsByOwner - Afiseaza lista de masini pentru un proprietar");
        System.out.println("getCarsNoByOwner - Afiseaza nr de masini pentru un proprietar");
        System.out.println("quit         - Inchide aplicatia");
    }

    public void run() {
        boolean quit = false;
        while(!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String command = scanner.nextLine();
            switch(command) {
                case "help":
                    printCommandsList();
                    break;
                case "add":
                    rentCar(getPlateNo(), getOwnerName());
                    break;
                case "check":
                    System.out.println(isCarRent(getPlateNo()));
                    break;
                case "remove":
                    returnCar(getPlateNo());
                    break;
                case "getOwner":
                    getCarRent(getPlateNo());
                    break;
                case "carsRented":
                    System.out.println(rentedCar.size());
                    break;
                case "getCarsByOwner":
                    System.out.println("Persoana introdusa a inchiriat masinile urmatoare: "+ getCarsList().toString());
                    break;
                case "getCarsNoByOwner":
                    System.out.println("Persoana introdusa a inchiriat: "+ getCarsList().size() +" masini");
                    break;
                case "quit":
                    System.out.println("Aplicatia se inchide...");
                    quit = true;
                    break;
                default:
                    System.out.println("Unknown command. Choose from:");
                    printCommandsList();
            }
        }
    }

    public static void main(String[] args) {
        // create and run an instance (for test purpose)
        new CarRentalSystem().run();

    }
}
