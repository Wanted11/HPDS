
package sintacty;

public class Root {
    private Token leftToken;
    private Token rigthToken;

    public Root(Token leftToken, Token rigthToken) {
        this.leftToken = leftToken;
        this.rigthToken = rigthToken;
    }

    public Token getLeftToken() {
        return leftToken;
    }

    public void setLeftToken(Token leftToken) {
        this.leftToken = leftToken;
    }

    public Token getRigthToken() {
        return rigthToken;
    }

    public void setRigthToken(Token rigthToken) {
        this.rigthToken = rigthToken;
    }
    
}
