
package factorymethod;


public class Dog implements IAnimal{

    public Dog() {
    }
      @Override
        public String getAnimal(String name) {
            return "Dog";
        }

    @Override
    public String toString() {
        return "Gau gau";
    }
    
}
