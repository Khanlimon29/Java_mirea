package p3.app;
import p3.vehicle.car;
import p3.vehicle.electricCar;


public class main {
    public static void main(String[] args) {
        car Car1 = new car();
        Car1.ownerNameSet("Oleg");
        Car1.insuranceNumberSet("19573958");
        Car1.engineTypeSet("ICEngine");

        electricCar Car2 = new electricCar();
        Car2.ownerNameSet("Pavel");
        Car2.insuranceNumberSet("769476t95");
        Car2.batarryCapacitySet("55 KWT");

        System.out.print("Класс Car:\n" + "Владелец: " + Car1.ownerNameGet() + "\nНомер страховки: " +
                Car1.insuranceNumberGet() + "\nТип двигателя: " + Car1.engineTypeGet() + "\n\nКласс ElectricCar:\n" +
                "Владелец: " + Car2.ownerNameGet() + "\nНомер страховки: " +
                Car2.insuranceNumberGet() + "\nТип двигателя: " + Car2.engineTypeGet() + "\nВместимость батареи: " + Car2.batarryCapacityGet());
        }
}