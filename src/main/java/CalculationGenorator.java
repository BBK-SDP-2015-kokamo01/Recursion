public class CalculationGenorator {
    public static void main(String[] args) {
        CalculatorFactory calculatorFactory = new CalculatorFactory();

        Calculator calculator = calculatorFactory.getCalculator("Factorial");
        System.out.println(calculator.calculate(4));

        Calculator calculator1 = calculatorFactory.getCalculator("Fibonacci");
        System.out.println(calculator1.calculate(5));
    }
}
