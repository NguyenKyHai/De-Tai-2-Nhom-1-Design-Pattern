package AbstractFactory;

public class AnimalFactory implements IAbstractFactory<IAnimal> {

    @Override
    public IAnimal create(String name) {
       
        if ("Dog".equalsIgnoreCase(name)) {
            return new Dog();
                }
        else if("Cat".equalsIgnoreCase(name)){
            return new Cat();
        }
        else if ("Duck".equalsIgnoreCase(name)) {
            return new Duck();
        }
    return null;
    }
}
