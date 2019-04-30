
package CoRExample2;

public class UseFifties implements Chain{
    
    private Chain nextInChain;
    
    public void setNextChain(Chain nextChain){
        nextInChain = nextChain;
    }
    
    public void withdraw(Money request){
        int amount = (request.getRequestedMoney()-request.getRequestedMoney()%50)/50;
        if((request.getRequestedMoney() % 50) == 0){
            System.out.println("U heeft $" + request.getRequestedMoney() + " afgehaald in " + amount + " biljet()ten van 50.");
        }else{
            System.out.println("U heeft $" + (request.getRequestedMoney()-request.getRequestedMoney()%50) + " afgehaald in " + amount + " biljet(ten) van 50.");
            Money next = new Money(request.getRequestedMoney()%50);
            nextInChain.withdraw(next);
        }
    }
    
}
