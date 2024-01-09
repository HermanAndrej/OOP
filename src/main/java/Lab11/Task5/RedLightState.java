package Lab11.Task5;

public class RedLightState implements TrafficLightState{
    @Override
    public void transitionToRed() {
        System.out.println("Already in red light state!");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Switching to green...");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Switching to yellow...");
    }
}
