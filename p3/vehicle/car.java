package p3.vehicle;
import java.util.Scanner;


public class car {
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public void ownerNameSet(String name) {
        this.ownerName = name;
    }

    public String ownerNameGet() {
        return ownerName;
    }

    public void insuranceNumberSet(String number) {
        this.insuranceNumber = number;
    }

    public String insuranceNumberGet() {
        return insuranceNumber;
    }

    public void engineTypeSet(String type) {
        this.engineType = type;
    }

    public String engineTypeGet() {
        return engineType;
    }

}