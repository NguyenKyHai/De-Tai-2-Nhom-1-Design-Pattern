package AbstractFactory;

public class FactoryProvider {
   
   public IAbstractFactory getFactory(String choice){
        
        if("IAnimal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("IColor".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        
        return null;
    }  
}
