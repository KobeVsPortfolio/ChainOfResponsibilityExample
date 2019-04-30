
package CoRExample2;

public interface Chain {
    
    public void setNextChain(Chain nextChain);
    
    public void withdraw(Money request);
}
