package DavidMilicevic.zadatak1;

public class Main {
    public static void main(String[] args) {
        GoodStudent goodStudent = new GoodStudent();
        BadStudent badStudent = new BadStudent();

        goodStudent.intro();
        goodStudent.learn();
        goodStudent.sleep();
        badStudent.intro();
        badStudent.learn();
        badStudent.sleep();


    }
}