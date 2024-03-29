public class SimpleCalculator{
    private double firstNumber;
    private double secondNumber;
    private double multiply;
    private double division;
    private double addition;
    private double subtraction;


    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber() {
        return this.secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        return firstNumber / secondNumber;
    }
}
