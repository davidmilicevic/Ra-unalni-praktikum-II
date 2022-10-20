package DavidMilicevic.zadatak3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAverageGrade(15);
        student.setName("David");
        student.setYearOfStudy(5);
        System.out.println(student.getAverageGrade());
        System.out.println(student.getName());
        System.out.println(student.getYearOfStudy());

    }
}
