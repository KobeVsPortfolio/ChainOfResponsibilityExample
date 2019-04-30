package CoRExample2;

public class UseFives implements Chain{
    
    private Chain nextInChain;
    
    public void setNextChain(Chain nextChain){
        nextInChain = nextChain;
    }
    
    public void withdraw(Money request){
        int amount = (request.getRequestedMoney()-request.getRequestedMoney()%5)/5;
        if((request.getRequestedMoney() % 5) == 0){
            System.out.println("U heeft $" + (request.getRequestedMoney()-request.getRequestedMoney()%5) + " afgehaald in " + amount + " biljet(ten) van 5.");
        }else{
            System.out.println("U heeft $" + (request.getRequestedMoney()-request.getRequestedMoney()%5) + " afgehaald in " + amount + " biljet(ten) van 5.");
            System.out.println("Kleinere bedragen dan $5 worden genegeerd.");
        }
    }
    
}