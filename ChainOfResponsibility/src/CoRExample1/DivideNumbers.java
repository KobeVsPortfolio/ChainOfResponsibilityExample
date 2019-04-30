
package CoRExample1;

public class DivideNumbers implements Chain{
    
    private Chain nextInChain;
    
    public void setNextChain(Chain nextChain){
        nextInChain = nextChain;
    }
    
    @Override
    public void calculate(Numbers request){
        if(request.getCalculation() == "divide"){
            System.out.println(request.getNum1() + " / " + request.getNum2() + " = " +
                    (request.getNum1()-request.getNum2()));
        } else {
            System.out.println("The provided calculation-method is not valid.");
    }
    }
}