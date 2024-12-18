package p4.vehicle;
import java.util.Scanner;


public class car extends vehicle{

    public car(){
        this.setEngineType("IC engine");
    }

    @Override
    public String vehicleType() {
        return "car";        
    }
}