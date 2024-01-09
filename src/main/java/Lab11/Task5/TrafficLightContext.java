package Lab11.Task5;

public class TrafficLightContext{

    private TrafficLightState state;

    public TrafficLightContext(){
        this.state = new RedLightState();
    }

    public void setTrafficLightState(TrafficLightState state){
        this.state = state;
    }


    public void transitionToRed() {
        state.transitionToRed();
        setTrafficLightState(new RedLightState());
    }

    public void transitionToGreen() {
        state.transitionToGreen();
        setTrafficLightState(new GreenLightState());
    }


    public void transitionToYellow() {
        state.transitionToYellow();
    }
}
