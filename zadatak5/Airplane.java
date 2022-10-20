package DavidMilicevic.zadatak5;

public class Airplane {
    public void Fly() {
        System.out.println("Avion leti");
    }
    public void Fly(int value) {
        System.out.println("Avion leti na visini"+ value);
    }
    public void Fly(int value, String ime) {
        System.out.println("Avion leti na visini"+ value + ime);
    }
}
