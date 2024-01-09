package Quiz5prep.State;

public class RedLightState implements TrafficLightState{
    @Override
    public void transitionToRed() {
        System.out.println("Already in red state!");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Changing to green!");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Changing to yellow!");
    }
}
