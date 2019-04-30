package CoRExample2;

public class CoR {


    public static void main(String[] args) {
        
        Chain chainCalc1 = new UseHundreds();
        Chain chainCalc2 = new UseFifties();
        Chain chainCalc3 = new UseTwenties();
        Chain chainCalc4 = new UseTens();
        Chain chainCalc5 = new UseFives();

        
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);
        chainCalc4.setNextChain(chainCalc5);

        Money request = new Money(150);
  
        chainCalc1.withdraw(request);
        
    }
    
}
