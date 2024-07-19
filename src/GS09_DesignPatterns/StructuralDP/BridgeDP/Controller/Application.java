package GS09_DesignPatterns.StructuralDP.BridgeDP.Controller;

// Client code
public class Application {
    public static void main(String[] args) {
        Device tv = new Tv();
        RemoteControl remoteControl = new RemoteControl(tv);

        remoteControl.togglePower(); // TV is now ON
        remoteControl.volumeUp();    // TV volume set to 40
        remoteControl.channelUp();   // TV channel set to 2

        Device radio = new Radio();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);

        advancedRemoteControl.togglePower(); // Radio is now ON
        advancedRemoteControl.volumeUp();    // Radio volume set to 30
        advancedRemoteControl.mute();        // Radio volume set to 0
    }
}

