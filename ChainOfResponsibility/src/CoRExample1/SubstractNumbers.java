
package CoRExample1;

public class SubstractNumbers implements Chain{
    
    private Chain nextInChain;
    
    public void setNextChain(Chain nextChain){
        nextInChain = nextChain;
    }
    
    @Override
    public void calculate(Numbers request){
        if(request.getCalculation() == "substract"){
            System.out.println(request.getNum1() + " - " + request.getNum2() + " = " +
                    (request.getNum1()-request.getNum2()));
        } else {
            nextInChain.calculate(request);
        }
    }
    
}

