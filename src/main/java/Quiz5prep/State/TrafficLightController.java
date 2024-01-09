package Quiz5prep.State;

public class TrafficLightController {
    public static void main(String[] args) {
        TrafficLightContext state = new TrafficLightContext();

        state.transitionToRed();
        state.setState(new YellowLightState());
        state.transitionToGreen();
        state.transitionToYellow();
    }
}
