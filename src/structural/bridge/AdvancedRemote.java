package structural.bridge;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(IDevice device) {
        super(device);
    }

    public void mute(){
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
