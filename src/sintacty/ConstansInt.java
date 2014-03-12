
package sintacty;

public class ConstansInt implements Token{

    private final int number;

    public ConstansInt(int number) {
        this.number = number;
    }
    
  
    @Override
    public Object evaluate() {
        return number;
    }
    
}
