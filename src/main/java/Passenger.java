public class Passenger {
    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
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
