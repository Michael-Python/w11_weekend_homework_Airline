public class Passenger {
    private String name;
    private int numberOfBags;
    private double passengerWeight;

    public Passenger(String name, int numberOfBags, double passengerWeight){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.passengerWeight = passengerWeight;
    }

    public String getName(){
        return this.name;
    }

    public int getBagNumber() {
        return this.numberOfBags;
    }

    public void getPassengerNameByNumber(){
        System.out.println(this.name + " was checked in");
    }

}

