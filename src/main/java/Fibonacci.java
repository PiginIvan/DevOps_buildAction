public class Fibonacci {

    public int getFibonacciValue(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else  {
            return getFibonacciValue(n - 1) + getFibonacciValue(n - 2);
        }
    }
}