package DavidMilicevic.zadatak2;

public class EngineeringStudent implements Human,Student {
    @Override
    public void watchTv() {
        System.out.println("broj utrošenih sati na gledanje tv-a: 16");
    }

    @Override
    public void sleep() {
        System.out.println("Broj sati sna: 8");
    }

    @Override
    public void printYearAndCollegeName() {
        System.out.println(Year+" godina " + CollegeName);

    }
}
