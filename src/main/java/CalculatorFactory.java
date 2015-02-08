public class CalculatorFactory {

    public Calculator getCalculator(String calculatorType){
        if (calculatorType.equals("Factorial")) {
            return new FactorialCalculator();

        } else if (calculatorType.equals("Fibonacci")) {
            return new FibonacciCalculator();
        }else{
            return null;
        }
    }
}
