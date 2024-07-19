package GS09_DesignPatterns.StructuralDP.BridgeDP.Controller;

// AdvancedRemoteControl class
public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}
