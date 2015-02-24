/**
We have a number of bunnies and each bunny has two big floppy ears.
We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
*/
 public class BunnyEarsCalculator implements Calculator {

    @Override
    public int calculate(int bunnies) {
        if (bunnies == 0) return bunnies;
        else return calculate(bunnies -1) + 2;
    }
}
