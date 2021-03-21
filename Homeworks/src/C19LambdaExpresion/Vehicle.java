package C19LambdaExpresion;

public class Vehicle {
    private String serialNumber ="123";
    private int noPersons;
    private String name ;

    public Vehicle(String s, int i, String car) {
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
        this.name = name;
    }

    public Vehicle(String serialNumber, int noPersons) {
        this(serialNumber, noPersons, "");
    }

    private void displaySerialNumberAndPassword() {
        System.out.println("Method hacked: " + serialNumber);
        System.out.println("Password is: " + "dsf98fsd98!{dev}hack!345m");
    }

    private boolean changeNoPersons(int no) {
        this.noPersons = no;
        return true;
    }
}
