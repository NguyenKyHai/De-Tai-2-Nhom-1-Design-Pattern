package factorymethod;

public class AnimalFactoy {
     
        public IAnimal creatAnimal(String name) {
            if (name == null) {
                return null;
            }
            switch (name) {
                case "Dog":
                    return new Dog();
                case "Cat":
                    return new Cat();
                case "Duck":
                    return new Duck();
                default:
                    throw new IllegalArgumentException("This Animal is unsupported");

            }
        }
}
