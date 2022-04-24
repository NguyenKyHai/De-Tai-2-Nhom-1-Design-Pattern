package AbstractFactory;

public class Cat implements IAnimal{

    public Cat() {
    }

   @Override
        public String getAnimal(String name) {
            return "Cat";
        }

    @Override
    public String toString() {
        return "Meo meo";
    }
        
}
