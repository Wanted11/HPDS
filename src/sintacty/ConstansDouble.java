
package sintacty;

public class ConstansDouble implements Token{
    
    private final double number;

    public ConstansDouble(double number) {
        this.number = number;
    }

    @Override
    public Object evaluate() {
        return number;
    }
}
