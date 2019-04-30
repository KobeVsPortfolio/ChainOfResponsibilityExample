
package CoRExample2;

public class UseHundreds implements Chain{
    
    private Chain nextInChain;
    
    public void setNextChain(Chain nextChain){
        nextInChain = nextChain;
    }
    
    public void withdraw(Money request){
        System.out.println("Gevraagd bedrag: $" + request.getRequestedMoney());
        int amount = (request.getRequestedMoney()-request.getRequestedMoney()%100)/100;
        if((request.getRequestedMoney() % 100) == 0){
            System.out.println("U heeft $" + request.getRequestedMoney() + " afgehaald in " + amount + " biljet(ten) van 100.");
        }else{
            System.out.println("U heeft $" + (request.getRequestedMoney()-request.getRequestedMoney()%100) + " afgehaald in " + amount + " biljet(ten) van 100.");
            Money next = new Money(request.getRequestedMoney()%100);
            nextInChain.withdraw(next);
        }
    }
    
}
