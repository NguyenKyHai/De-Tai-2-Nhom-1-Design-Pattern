package factorymethod;

public class FactoryMethod {

    public static void main(String[] args) {
        AnimalFactoy animalFactoy = new AnimalFactoy();
        IAnimal animal1 = animalFactoy.creatAnimal("Dog");
        IAnimal animal2 = animalFactoy.creatAnimal("Cat");
        System.out.println(animal1);
        System.out.println(animal2);
    }
}
