
package CoRExample1;

public class AddNumbers implements Chain {
    
    private Chain nextInChain;
    
    public void setNextChain(Chain nextChain){
        nextInChain = nextChain;
    }
    
    public void calculate(Numbers request){
        if(request.getCalculation() == "add"){
            System.out.println(request.getNum1() + " + " + request.getNum2() + " = " + (request.getNum1() + request.getNum2()));   
    } else{
            nextInChain.calculate(request);
        }
    }
 
}
