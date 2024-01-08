package Lab11.Task4;

public class Main {
    public static void main(String[] args) {
        OldDevice oldDevice = new OldDeviceImpl();

        DeviceAdapter deviceAdapter = new DeviceAdapter(oldDevice);

        deviceAdapter.operateNewFunction();

    }
}
