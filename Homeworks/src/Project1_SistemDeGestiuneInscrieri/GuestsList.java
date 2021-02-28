package Project1_SistemDeGestiuneInscrieri;

import java.util.ArrayList;
import java.util.Objects;

public class GuestsList {
    private final String eventName;
    private int maxParticipants = 4;
    //private int waitingParticipants ;
    private ArrayList<Guest> participantsList = new ArrayList<>(maxParticipants) ;

    public GuestsList (String eventName, int maxParticipants){
        this.eventName = "Devmind Event";
        this.maxParticipants = 4;
    }

    //pct 1
    public int addParticipants(Guest guest) {
        int result = 0;
        if (searchPers(guest)){
            result = -1;
        } else if (!searchPers(guest)) {
            participantsList.add(guest);
            if (participantsList.size() <= maxParticipants) {
                System.out.println("[" + guest + "]"+ "Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
                result = 0;
            }
            if (participantsList.size() > maxParticipants) {
                int waitingNo = participantsList.size() - maxParticipants;
                System.out.println("[" + guest + "]"+"Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine: " +
                        waitingNo + ". Te vom notifica daca un loc devine disponibil.");
                result = 1;
            }
        }
        return result;
    }

    public boolean searchPers(Guest guest){
        boolean exist = false;
        if (participantsList.size() == 0){
            return false;
        }else {
            for (Guest iterator : participantsList) {
                if (iterator.equals(guest)) {
                    exist = true;
                }
            }
        }
        return exist;
    }

    public ArrayList <Guest> searchPerson(String searchValue){

        System.out.println("Cauta dupa first name si last name sau email sau phone");


        ArrayList <Guest> validatedGuests = new ArrayList<>();
        for (Guest guestVerified : participantsList){
            if (guestVerified.searchString(searchValue)){
                validatedGuests.add(guestVerified);
            }
        }
        return validatedGuests;
    }

    //pct. 2
    public void checkParticipants(Guest guest){

        if( participantsList.indexOf(guest) <= maxParticipants){
            System.out.println("Persoana este inscrisa la eveniment!");
        }else if (participantsList.indexOf(guest) > maxParticipants){
                System.out.println("Persoana este inscrisa pe lista de asteptare");
        }else{
            System.out.println("Persoana nu apare in nicio lista!");
        }
    }

    //pct.3
    public boolean removeParticipants(Guest guest){
        boolean result = false;

            if (participantsList.size() > maxParticipants) {
                if (participantsList.indexOf(guest) <= maxParticipants) {
                    participantsList.remove(guest);
                    result = true;
                    System.out.println("[" + participantsList.get(maxParticipants - 1) + "]" + " Felicitari! Ai prins un loc liber. Te asteptam!");
                } else if (participantsList.indexOf(guest) > maxParticipants) {
                    participantsList.remove(guest);
                    System.out.println("A fost stearsa o persoana de pe lista de asteptare");
                    result = true;
                }
            }else{
                System.out.println("A fost stearsa o persoana din lista de participanti!");
                participantsList.remove(guest);
            }
        return result;
    }

    //pct.4
    public void updateParticipantsLastName(Guest guest, String elementToSet){

        if (participantsList.size() > 0){
            guest.setLastName(elementToSet);
        }
    }
    public void updateParticipantsFirstName(Guest guest, String elementToSet){

        if (participantsList.size() > 0){
            guest.setFirstName(elementToSet);
        }
    }
    public void updateParticipantsEmail(Guest guest, String elementToSet){

        if (participantsList.size() > 0){
            guest.setEmail(elementToSet);
        }
    }
    public void updateParticipantsPhoneNo(Guest guest, String elementToSet){

        if (participantsList.size() > 0){
            guest.setPhoneNo(elementToSet);
        }
    }

    //pct.5
    public void listOfParticipants() {
        for (int i = 0; i < participantsList.size(); i++) {
            System.out.print(participantsList.get(i) + ", ");
        }
    }

    //pct.6
    public void waitingList(){
        if (participantsList.size() > maxParticipants){
            for (int i = maxParticipants; i < participantsList.size(); i++ ) {
                System.out.print(participantsList.get(i) + ", ");
            }
        }else {
                System.out.println("Nu sunt persoane pe waitinglist!");
            }
    }

    //pct.7
    public void remainingSeats(){
        int remainingSeats;
        if (maxParticipants > participantsList.size()){
            remainingSeats = maxParticipants -participantsList.size();
        }else{
            remainingSeats = 0;
        }
        System.out.println(remainingSeats);
    }

    //pct.8
    public void maxParticipantsNo(){
        System.out.println("Numarul maxim de participanti este: " + maxParticipants);
    }

    //pct.9
    public void waitingParticipantsNo(){
        int waitingParticipationNo = (participantsList.size() - maxParticipants);

        if (waitingParticipationNo < 0){
            waitingParticipationNo = 0;
        }
        System.out.println("Numarul persoanelor aflate pe lista de asteptare este:  " + waitingParticipationNo);
    }

    //pct.10
    public void totalPersons (){
        System.out.println("Numarul total al persoanelor este: " + participantsList.size());
    }

    //pct.11
    public void search(String searchString){
        System.out.println("Introdu sirul de caractere dupa care vrei sa cauti !");

        ArrayList<Guest> listOfContactsWithString = new ArrayList<>(0);

        for (Guest iterator : participantsList){
            if (iterator.searchString(searchString)){
                listOfContactsWithString.add(iterator);
            }
        }
        if (listOfContactsWithString.size() > 0){
            for(Guest iterator : listOfContactsWithString){
                System.out.println(iterator + ", ");
            }
        }else{
            System.out.println("Cautarea nu returneaza niciun rezultat!");
        }

    }

    @Override
    public String toString() {
        return "GuestsList{" +
                "eventName='" + eventName + '\'' +
                ", maxParticipants=" + maxParticipants +
                ", participantsList=" + participantsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GuestsList)) return false;
        GuestsList that = (GuestsList) o;
        return maxParticipants == that.maxParticipants && Objects.equals(eventName, that.eventName) && Objects.equals(participantsList, that.participantsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, maxParticipants, participantsList);
    }
}






