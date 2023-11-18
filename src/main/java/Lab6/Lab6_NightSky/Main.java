package Lab6.Lab6_NightSky;

public class Main {
    public static void main(String[] args){
        /*
        NightSky nightSky = new NightSky(0.1, 40, 10);
        nightSky.printLine();
         */
        NightSky nightSky = new NightSky(8,4);
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
    }
}