package C8;

public class OnRoad extends Vehicle {
    private int noWheels;
    private int noDoors;

    public OnRoad (String serialNumber, int noPersons){
        super (serialNumber, noPersons);
        this.noDoors = 4;
        this.noWheels = 4;
    }

    public OnRoad(String serialNumber, int noPersons, String name){
        super(serialNumber,noPersons,name);
        this.noDoors = 4;
        this.noWheels = 4;
    }
    public OnRoad (String serialNumber, int noPersons, String name, int noDoors ){
        super(serialNumber,noPersons,name);
        this.noDoors = noDoors;
    }

    public OnRoad (String serialNumber, int noPersons, String name, int noDoors, int noWheels ){
        super(serialNumber,noPersons,name);
        this.noDoors = noDoors;
        this.noWheels = noWheels;
    }

    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("Driving the vehicle on road to coordinates: [" + positionX + " ," + positionY + "]");
        return true;
    }

    @Override
    public boolean addFuel(double amount){
        System.out.println("Adding " + amount + "l of fuel to the driving vehicle");
        return true;
    }

    @Override
    public void printInfo (){
        super.printInfo();
        System.out.println("Driving vehicle properties:" + "\n\t" +
                "- " + "number of wheels: " + noWheels + "\n\t" +
                "- " + "number of doors: " + noDoors);
    }


}
