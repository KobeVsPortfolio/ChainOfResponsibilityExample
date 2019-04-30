
package CoRExample1;

public class ChainOfResponsibility {


    public static void main(String[] args) {
        
        Chain c1 = new AddNumbers();
        Chain c2 = new SubstractNumbers();
        Chain c3 = new MultiplyNumbers();
        Chain c4 = new DivideNumbers();
        
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        
        Numbers request = new Numbers(1, 2, "hv");
        c2.calculate(request);
    }
    
}
