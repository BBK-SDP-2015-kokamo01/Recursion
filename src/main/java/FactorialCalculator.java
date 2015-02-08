public class FactorialCalculator implements Calculator {

    @Override
    public int calculate(int num) {
        if(num == 1) return num;
        return calculate(num - 1) * num;
    }
}


