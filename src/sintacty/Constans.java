
package sintacty;

public class Constans implements Token{

    private final double number;

    public Constans(double number) {
        this.number = number;
    }
    
    @Override
    public Token evaluate() {
        return this;
    }
    
}
