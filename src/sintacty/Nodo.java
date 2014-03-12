
package sintacty;

public class Nodo {
    private final Token nodoLeft;
    private final Token nodoRigth;

    public Nodo(Token nodoLeft, Token nodoRigth) {
        this.nodoLeft = nodoLeft;
        this.nodoRigth = nodoRigth;
    }

    public Token getNodoLeft() {
        return nodoLeft;
    }

    public Token getNodoRigth() {
        return nodoRigth;
    }
}
