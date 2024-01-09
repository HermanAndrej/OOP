package Quiz5prep.State;

public class GreenLightState implements TrafficLightState{
    @Override
    public void transitionToRed() {
        System.out.println("Changing to red!");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Already in green state!");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Changing to yellow!");
    }
}
