package Proxy;

public class ProxyMain {

    public static void main(String[] args) {
        IRemote remote=new LazyLoadingProxy();
        remote.turnOn();
        remote.turnOff();
    }
    
}
