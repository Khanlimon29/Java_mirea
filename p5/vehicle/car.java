package p5.vehicle;

public class car extends vehicle{

    public car(){
        this.setEngineType("IC engine");
    }

    @Override
    public String vehicleType() {
        return "car";        
    }
}