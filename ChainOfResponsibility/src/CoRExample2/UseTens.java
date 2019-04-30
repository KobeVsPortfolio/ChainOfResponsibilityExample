package CoRExample2;

public class UseTens implements Chain{
    
    private Chain nextInChain;
    
    public void setNextChain(Chain nextChain){
        nextInChain = nextChain;
    }
    
    public void withdraw(Money request){
        int amount = (request.getRequestedMoney()-request.getRequestedMoney()%10)/10;
        if((request.getRequestedMoney() % 10) == 0){
            System.out.println("U heeft $" + request.getRequestedMoney() + " afgehaald in " + amount + " biljet(ten) van 10.");
        }else{
            System.out.println("U heeft $" + (request.getRequestedMoney()-request.getRequestedMoney()%10) + " afgehaald in " + amount + " biljet(ten) van 10.");
            Money next = new Money(request.getRequestedMoney()%10);
            nextInChain.withdraw(next);
        }
    }
    
}