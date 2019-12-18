public class Main1 {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(9.0);
        calculator.setSecondNumber(5.5);

        System.out.println("first number " + calculator.getFirstNumber());
        System.out.println("second number is " + calculator.getSecondNumber());
        System.out.println("Add is " + calculator.getAdditionResult());
        System.out.println("sub is " + calculator.getSubtractionResult());
        System.out.println("mul is " + calculator.getMultiplicationResult());
        System.out.println("div is " + calculator.getDivisionResult());

    }
}
