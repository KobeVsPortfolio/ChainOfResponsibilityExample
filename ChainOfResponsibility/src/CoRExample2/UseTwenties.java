package CoRExample2;

public class UseTwenties implements Chain{
    
    private Chain nextInChain;
    
    public void setNextChain(Chain nextChain){
        nextInChain = nextChain;
    }
    
    public void withdraw(Money request){
        int amount = (request.getRequestedMoney()-request.getRequestedMoney()%20)/20;
        if((request.getRequestedMoney() % 20) == 0){
            System.out.println("U heeft $" + request.getRequestedMoney() + " afgehaald in " + amount + " biljet(ten) van 20.");
        }else{
            System.out.println("U heeft $" + (request.getRequestedMoney()-request.getRequestedMoney()%20) + " afgehaald in " + amount + " biljet(ten) van 20.");
            Money next = new Money(request.getRequestedMoney()%20);
            nextInChain.withdraw(next);
        }
    }
    
}