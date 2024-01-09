package Quiz5prep.State;

public class YellowLightState implements TrafficLightState{
    @Override
    public void transitionToRed() {
        System.out.println("Changing to red!");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Changing to green!");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Already in yellow state!");
    }
}
