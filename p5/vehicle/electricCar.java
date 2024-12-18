package p5.vehicle;

public class electricCar extends car implements electricVehicle{
    private String batteryCapacity;
    public electricCar() {
        setEngineType("Electric");
    }

    @Override
    public String getBatteryCapacity() {
        return batteryCapacity;
    }
    @Override
    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType(){
        return "electricCar";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nЁмкость батареи: "+ getBatteryCapacity()
                + "\n";
    }
}