public class CalculationGenorator {
    public static void main(String[] args) {
        CalculatorFactory calculatorFactory = new CalculatorFactory();

        Calculator factorialCalculator = calculatorFactory.getCalculator("Factorial");
        System.out.println(factorialCalculator.calculate(4));

        Calculator fibonacciCalculator = calculatorFactory.getCalculator("Fibonacci");
        System.out.println(factorialCalculator.calculate(5));

        Calculator bunnieEarCalculator = new BunnyEarsCalculator();
        System.out.println(bunnieEarCalculator.calculate(6));

        Calculator triangleCalculator = new TriangularNumberCalculator();
        System.out.println(triangleCalculator.calculate(5));

        /**
         2.3 c) Hanoi towers
         A legend says that, somewhere in the East, near Hanoi, there is a temple. In the temple, there are three posts. In the posts, there are 64 discs of 64 different sizes. When the world was created, all the discs were in the first post; when all the discs are moved to the last post, the world will end.
         The monks in the temple move the discs between posts, but they must obey two simple rules. First, only one disc can be moved at a time, from one post to another post (it cannot be left anywhere else). Last, but not least, a disc can only be placed on top of a bigger disc, never on top of a smaller disc. The smallest disc can be placed on any post (all other discs are bigger); the biggest disc can only be placed on an empty post.
         Create a method that calculates the number of moves necessary to move a set of n Hanoi disks from the initial post to the last post. Hint: if you want to play monk yourself in order to better understand the problem, ask the lecturer for a “Hanoi envelope”.

         3 Paper sizes (*)
         A Din-A0 sheet of paper is 841mm × 1189mm (its surface is one square meter). Successive measurements of paper are defined recursively as “half” or “double” the preceding size. Therefore, a Din-A1 sheet of paper is half of Din-A0, or 594mm × 841mm; while a Din-A00 is double of Din-A0, or 1189mm× 1682mm.
         Create a method that takes a String parameter representing a size (e.g. ”A4”, “A00000”) and prints on screen the size of the corresponding sheet of paper. For simplicity, you can ignore rounding errors when calculating smaller sizes.
         Hint: note that two consecutive sizes always share one side and only the other one is multiplied or divided by two, e.g. the short side of Din-A2 is as long as the long side of Din-A3, while the long side of Din-A2 is twice as long as the short side of Din-A3.
         2

         4 Palindrome
         Create a program with a (recursive) method that takes a String paremeter and returns true if the String is a palindrome and false otherwise. Compare this recursive version with the iterative version you wrote in past weeks. Which one seems clearer to you?

         5 Power
         Create a class with a static method pow that takes to integers (base and exponent) and calculates the power, e.g. pow(2,3) calculates 23.
         Is it easy to do this both iteratively and recursively?

         6 Eight Dames (**)
         Create a method that calculates the solution to the problem of the eight Dames: “given a chess board, and knowing that the Dame can reach any tile horizontally, vertically, or diagonally, place 8 Dames on the board so that none of them can reach the others by doing only one move”. You can return the solution as an array of 8x8 booleans where eight tiles are true (those with the Dames on them) and the others are false.
         For extra complexity, make your method return all the possibilities in which the problem can be solved (this may take a long time).
         */
    }
}
