package p4.vehicle;

public class electricCar extends car{
    private String batteryCapacity;
    public electricCar() {
        setEngineType("Electric");
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType(){
        return "ElectricCar";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nЁмкость батареи: "+ getBatteryCapacity()
                + "\n";
    }

}