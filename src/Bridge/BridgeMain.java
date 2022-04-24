package Bridge;

public class BridgeMain {

    public static void main(String[] args) {
        Animal bigDog = new Dog(3, 500, "Thịt bò", new BigDog());
        Animal smallDog = new Dog(2, 250, "Thịt heo", new SmallDog());

        bigDog.feed();
        smallDog.feed();
       
    }
    
}
