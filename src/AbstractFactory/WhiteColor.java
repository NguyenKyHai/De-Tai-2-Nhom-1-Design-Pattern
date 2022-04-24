
package AbstractFactory;

public class WhiteColor implements IColor {

    public WhiteColor() {
    }

    @Override
    public String getColor(String color) {
        return "White";
    }

    @Override
    public String toString() {
        return "WhiteColor";
    }
    
}
