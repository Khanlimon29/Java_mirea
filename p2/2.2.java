
import java.util.Scanner;

class Car {
    private String model, licence, color;
    private int year;

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

    public String getModel() {
        return model;   
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void To_String() {
        System.out.println("Модель: " + getModel() + "; Номер: " + getLicence() + "; Цвет: " + getColor() + "; Год: " + getYear());
    }

    public int ageOfCar() {
        int age;
        int currYear = 2024;
        age = currYear - year;
        return age;
    }
}

class Second_practice_2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 

        String model, licence, color;
        int year;

        System.out.println("Введите данные для первого конструктора: Модель, номер, цвет и год:");
        model = scnr.nextLine();
        licence = scnr.nextLine();
        color = scnr.nextLine();
        year = scnr.nextInt();

        scnr.nextLine();


        Car UnknownCar = new Car();
        UnknownCar.setModel(model);
        UnknownCar.setLicence(licence);
        UnknownCar.setColor(color);
        UnknownCar.setYear(year);

        System.out.println("Введите данные для Сузуки: Номер и цвет");
        licence = scnr.nextLine();
        color = scnr.nextLine();
        Car Suzuki = new Car();
        Suzuki.setLicence(licence);
        Suzuki.setColor(color);

        Car Mazda = new Car();

        UnknownCar.To_String();
        System.out.println("Возраст: " + UnknownCar.ageOfCar());
        Suzuki.To_String();
        System.out.println("Возраст: " + Suzuki.ageOfCar());
        Mazda.To_String();
        System.out.println("Возраст: " + Mazda.ageOfCar());
    }
}
