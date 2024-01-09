package Quiz5prep.Adapter;

public class Main {
    public static void main(String[] args) {
        OldDevice oldDevice = new OldDeviceImpl();

        DeviceAdapter deviceAdapter = new DeviceAdapter(oldDevice);
        deviceAdapter.operateNewFunction();
    }
}
