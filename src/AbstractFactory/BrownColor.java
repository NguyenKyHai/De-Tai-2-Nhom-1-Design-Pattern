package AbstractFactory;

public class BrownColor implements IColor {

    public BrownColor() {
    }

    @Override
    public String getColor(String color) {
        return "Brown";
    }

    @Override
    public String toString() {
        return "BrownColor";
    }
    
}