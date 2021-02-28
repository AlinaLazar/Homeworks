package Project1_SistemDeGestiuneInscrieri;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private final static Scanner sc = new Scanner(System.in);
    private final static GuestsList devmindEvent = new GuestsList("Devmind Event", 4);

    public static void main(String[] args) {
        File file = new File(".src/file.txt");

        System.out.println("Introdu comanda!");
        String command = sc.next();
        while (!command.equals("quit")) {
            switch (command) {
                case "help":
                    help();
                    break;
                case "add":
                    add();
                    break;
                case "check":
                    check();
                    break;
                case "remove":
                    remove();
                    break;
                case "update":
                    update();
                    break;
                case "guests":
                    guests();
                    break;
                case "waitlist":
                    waitList();
                    break;
                case "available":
                    available();
                    break;
                case "guests_no":
                    guestsNo();
                    break;
                case "waitList_no":
                    waitListNo();
                    break;
                case "subscribe_no":
                    subscribeNo();
                    break;
                case "search":
                    search();
                    break;
                default:
                    System.out.println("Comanda invalida!");
                    break;
            }
            System.out.println( );
            System.out.println("Introdu urmatoarea comanda!");
            command = sc.next();
        }
        if (command.equals("quit")){
            System.out.println("La revedere!");
        }
    }
        public static void help(){
            System.out.println("help - Afiseaza aceasta lista de comenzi\n" +
                    "add          - Adauga o noua persoana (inscriere)\n" +
                    "check        - Verifica daca o persoana este inscrisa la eveniment\n" +
                    "remove       - Sterge o persoana existenta din lista\n" +
                    "update       - Actualizeaza detaliile unei persoane\n" +
                    "guests       - Lista de persoane care participa la eveniment\n" +
                    "waitlist     - Persoanele din lista de asteptare\n" +
                    "available    - Numarul de locuri libere\n" +
                    "guests_no    - Numarul de persoane care participa la eveniment\n" +
                    "waitlist_no  - Numarul de persoane din lista de asteptare\n" +
                    "subscribe_no - Numarul total de persoane inscrise\n" +
                    "search       - Cauta toti invitatii conform sirului de caractere introdus\n" +
                    "quit         - Inchide aplicatia");
            System.out.println( );
        }

        public static void add(){
            System.out.println("Introduceti numele si apasati Enter: ");
            String lastName = sc.next();
            System.out.println("Introduceti prenumele si apasati Enter: ");
            String firstName = sc.next();
            System.out.println("Introduceti adresa de email si apasati Enter: ");
            String email = sc.next();
            System.out.println("Introduceti nr de  telefon si apasati Enter: ");
            String phoneNo = sc.next();

            Guest guest = new Guest (lastName,firstName,email,phoneNo);

            devmindEvent.addParticipants(guest);

    }
        public static void check() {
            System.out.println("Introduceti numarul aferent cautarii: \t\n" +
                    "1. pentru lastName si firstName \t\n" +
                    "2. pentru email \t\n" +
                    "3. pentru phoneNo \t\n");

            int searchNo = sc.nextInt();

            if (searchNo < 1 || searchNo > 3){
                System.out.println("Numarul este invalid.");
            } else {
                Guest.compareCase = searchNo;
            }
            String searchValue = sc.next();
            ArrayList <Guest> validatedPers = devmindEvent.searchPerson(searchValue);

            if (validatedPers.size() == 0){
                System.out.println("Nu exista persoane conforme cu criteriul de cautare.");
            } else {
                for (int i = 0; i < validatedPers.size(); i++) {
                    devmindEvent.checkParticipants(validatedPers.get(i));
                }
            }
        }

    public static void remove(){
        System.out.println("Introduceti numarul aferent cautarii: \t\n" +
                "1. pentru lastName si firstName \t\n" +
                "2. pentru email \t\n" +
                "3. pentru phoneNo \t\n");

        int searchNo = sc.nextInt();

        if (searchNo < 1 || searchNo > 3){
            System.out.println("Numarul este invalid.");
        } else {
            Guest.compareCase = searchNo;
        }
        String searchValue = sc.next();
        ArrayList <Guest> validatedPers = devmindEvent.searchPerson(searchValue);

        if (validatedPers.size() == 0){
            System.out.println("Nu exista persoane conforme cu criteriul de cautare.");
        } else {
            for (int i = 0; i < validatedPers.size(); i++) {
                devmindEvent.removeParticipants(validatedPers.get(0));
            }
        }
    }

    public static void update(){
        System.out.println("Introduceti numarul aferent cautarii: \t\n" +
                "1. pentru lastName si firstName \t\n" +
                "2. pentru email \t\n" +
                "3. pentru phoneNo \t\n");

        int searchNo = sc.nextInt();

        if (searchNo < 1 || searchNo > 3){
            System.out.println("Numarul este invalid.");
        } else {
            Guest.compareCase = searchNo;
        }
        String searchValue = sc.next();
        ArrayList <Guest> validatedPers = devmindEvent.searchPerson(searchValue);

        if (validatedPers.size() == 0){
            System.out.println("Nu exista persoane conforme cu criteriul de cautare.");
        } else {
            System.out.println("Introduceti numarul campului pe care doriti sa-l schimbati : \n\t" +
                    "1 pentru lastName + \n\t" +
                    "2 pentru firstName + \n\t" +
                    "3 pentru email +  \n\t" +
                    "4 pentru phoneNo + \n\t");

            int numberForUpdate = sc.nextInt();

            System.out.println("Introduceti noua valoare:");
            String elementToSet = sc.next();

            if (numberForUpdate == 1){
                for(int i = 0; i < validatedPers.size();i++){
                    devmindEvent.updateParticipantsLastName(validatedPers.get(i),elementToSet);
                }
            } else if (numberForUpdate == 2){
                for(int i = 0; i < validatedPers.size();i++){
                    devmindEvent.updateParticipantsFirstName(validatedPers.get(i),elementToSet);
                }
            } else if (numberForUpdate == 3){
                for(int i = 0; i < validatedPers.size();i++){
                    devmindEvent.updateParticipantsEmail(validatedPers.get(i),elementToSet);
                }
            } else if(numberForUpdate == 4){
                for(int i = 0; i < validatedPers.size();i++){
                    devmindEvent.updateParticipantsPhoneNo(validatedPers.get(i),elementToSet);
                }
            } else{
                System.out.println("Numarul introdus nu este valid!");
            }
        }
    }

    public static void guests(){
        devmindEvent.listOfParticipants();
    }

    public static void waitList(){
        devmindEvent.waitingList();
    }

    public static void available(){
        devmindEvent.remainingSeats();
    }

    public static void guestsNo(){
        devmindEvent.maxParticipantsNo();
    }

    public static void waitListNo(){
        devmindEvent.waitingParticipantsNo();
    }

    public static void subscribeNo(){
        devmindEvent.totalPersons();
    }

    public static void search(){
        String searchString = sc.next();
        devmindEvent.search(searchString);
    }

}
