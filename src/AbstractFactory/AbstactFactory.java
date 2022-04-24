package AbstractFactory;

public class AbstactFactory {

    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        IAnimal animal = (IAnimal) factoryProvider.getFactory("IAnimal").create("Cat");
        IColor color = (IColor) factoryProvider.getFactory("IColor").create("White");
        System.out.println(animal);
        System.out.println(color);
    }

}
