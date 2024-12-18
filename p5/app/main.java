package p5.app;
import p5.vehicle.car;
import p5.vehicle.electricCar;


public class main {
    public static void main(String[] args) {
        car Car1 = new car();
        Car1.setModel("audi rs7");
        Car1.setYear(2017);
        Car1.setColor("black");
        Car1.setLicense("Р394ВЕ07");
        Car1.setOwnerName("Oleg");
        Car1.setInsuranceNumber("19573958");


        electricCar Car2 = new electricCar();
        Car2.setModel("porshe taycan");
        Car2.setYear(2020);
        Car2.setColor("grey");
        Car2.setLicense("Т620УА78");
        Car2.setOwnerName("Pavel");
        Car2.setInsuranceNumber("769476t95");
        Car2.setBatteryCapacity("55 KWT");

        System.out.print(Car1 + "\n\n" + Car2);
    }
}