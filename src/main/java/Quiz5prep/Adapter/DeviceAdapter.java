package Quiz5prep.Adapter;

public class DeviceAdapter implements NewDevice{

    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice){
        this.oldDevice = oldDevice;
    }
    @Override
    public void operateNewFunction() {
        oldDevice.operateOldFunction();
    }
}
