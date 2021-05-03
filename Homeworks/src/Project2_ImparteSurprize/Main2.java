package Project2_ImparteSurprize;

import java.util.Scanner;

public class Main2 {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introdu comanda!");
        String command = sc.next();
        while (!command.equals("quit")) {
            switch (command) {
                case "help":
                    help();
                    break;
                case "generate":
                    generate();
                    break;
                case "default":
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

    public static void help() {
        System.out.println(
                "help       - Afiseaza aceasta lista de comenzi\n" +
                "generate   - Genereaza o noua surpriza  si o adauga in tolba \n" +
                "removeSurprise - Sterge surpiza din containerele: LIFO, FIFO sau Random \n" +
                "newBag     - Genereaza o noua tolba \n" +
                "giveSurprise- Imparte surprize \n" +
                "quit       - Inchide aplicatia");
        System.out.println();
    }

    public static void generate(){
        System.out.println("Ce surpriza doresti sa adaugi ? Alege numarul corespunzator!  \n" +
                "1. FortuneCookie\n" +
                "2. Cookie \n" +
                "3. MinionToy");
        int index = sc.nextInt();
        if (index == 1){
            FortuneCookie.generate();
        } else if (index == 2){
            Candies.generate();
        } else if (index == 3){
            MinionToy.generate();
        } else {
            System.out.println("Nu avem acest tip de surpriza!");
        }
    }


}
