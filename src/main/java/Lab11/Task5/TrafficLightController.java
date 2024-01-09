package Lab11.Task5;

public class TrafficLightController {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        context.transitionToRed();
        context.transitionToGreen();
        context.transitionToRed();
        context.transitionToRed();
    }
}
