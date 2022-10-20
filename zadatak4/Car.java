package DavidMilicevic.zadatak4;

public class Car extends Vehicle{
    public int wheelNumber = 4;
    @Override
    public String toString() {
        return "Car{" +
                "wheelNumber=" + wheelNumber +
                ", doorNumber=" + doorNumber +
                ", engineType='" + engineType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int doorNumber = 5;

    public Car(String engineType, String color, int wheelNumber, int doorNumber) {
        super(engineType, color);
        this.wheelNumber = wheelNumber;
        this.doorNumber = doorNumber;
    }
}
