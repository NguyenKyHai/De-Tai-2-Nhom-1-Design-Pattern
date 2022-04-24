package AbstractFactory;


public class Duck implements IAnimal {

    public Duck() {
    }

    @Override
    public String getAnimal(String name) {
        return "Duck";
    }

    @Override
    public String toString() {
        return "Cap cap";
    }
    
}
