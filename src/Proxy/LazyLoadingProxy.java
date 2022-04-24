package Proxy;

public class LazyLoadingProxy implements IRemote {

    RemoteImpl remote = null;

    @Override
    public void turnOn() {
        System.out.println(this.remote);
        if (this.remote == null) {
            this.remote = new RemoteImpl();
        }
        this.remote.turnOn();
    }

    @Override
    public void turnOff() {
         System.out.println(this.remote);
        if (this.remote == null) {
            this.remote = new RemoteImpl();
        }
        this.remote.turnOff();
    }

}
