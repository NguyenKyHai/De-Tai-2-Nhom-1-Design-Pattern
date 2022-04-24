package Proxy;

public class RemoteImpl implements IRemote{

    @Override
    public void turnOn() {
        System.out.println("Turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off");
    }

    @Override
    public String toString() {
        return "RemoteImplement";
    }
    
}
