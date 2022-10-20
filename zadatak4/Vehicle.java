package DavidMilicevic.zadatak4;

public class Vehicle {
    public String engineType;
    public String color;

    public Vehicle(String engineType, String color) {
        this.engineType = engineType;
        this.color = color;
    }

    public void printEngineType(){
        System.out.println("Diesel");
    }
    public void printColor(){
        System.out.println("Crna");
    }

}
