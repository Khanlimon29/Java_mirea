package p2;
import java.util.Scanner;
class Car {
    public String model, licence, color;
    public int year;

    public Car(String model, String licence, String color, int year){
        this.model = model;
        this.licence = licence;
        this.color = color;
        this.year = year;
    }

    public Car(String licence, String color) {
        this.model = "Suzuki";
        this.licence = licence;
        this.color = color;
        this.year = 2019;
    }

    public Car() { 
        this.model = "Mazda";
        this.licence = "М948РИ97";
        this.color = "Red";
        this.year = 1989;
    }

    public void PrintSpecs() {
        System.out.println("Модель: " + model + "; Номер: " + licence + "; Цвет: " + color + "; Год: " + year);
    }




}

class Second_practice {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 

        String model, licence, color;
        int year;

        System.out.println("Введите данные для первого конструктора: Модель, номер, цвет и год:");
        model = scnr.nextLine();
        licence = scnr.nextLine();
        color = scnr.nextLine();
        year = scnr.nextInt();
        Car UnknownCar = new Car(model, licence, color, year);
        scnr.nextLine();
        

        System.out.println("Введите данные для Сузуки: Номер и цвет");
        licence = scnr.nextLine();
        color = scnr.nextLine();
        Car Suzuki = new Car(licence, color);

        Car Mazda = new Car();

        UnknownCar.PrintSpecs();
        Suzuki.PrintSpecs();
        Mazda.PrintSpecs();
    }
}
