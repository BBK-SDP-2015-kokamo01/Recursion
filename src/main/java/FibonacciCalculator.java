public class FibonacciCalculator implements Calculator {
    @Override
    public int calculate(int num) {
        if (num == 1 || num == 2){
            return 1;
        } else {
            return calculate(num-1) + calculate(num -2);
        }
    }
}
