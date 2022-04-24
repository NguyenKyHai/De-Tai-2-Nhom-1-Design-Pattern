package AbstractFactory;

public class BlackColor implements IColor {

    public BlackColor() {
    }

    @Override
    public String getColor(String color) {
        return "Black";
    }

    @Override
    public String toString() {
        return "BlackColor";
    }
    
}
