package p3.vehicle;

public class electricCar extends car{
    private String batteryCapacity;
    public electricCar() {
        engineTypeSet("Electric");
    }

    public void batarryCapacitySet(String capacity) {
        this.batteryCapacity = capacity;
    }

    public String batarryCapacityGet() {
        return batteryCapacity;
    }

}