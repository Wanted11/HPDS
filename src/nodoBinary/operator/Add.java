
package nodoBinary.operator;

import sintacty.ConstansInt;

public class Add{

    public double evaluate(ConstansInt tokenA, ConstansInt tokenB) {
        return (double) tokenB.evaluate() + (double) tokenA.evaluate();
    }
}
