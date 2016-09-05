package ee.ut.cs.aa.grading.lab_1.fibonacci;

/**
 * Iterative implementation
 */
public class FibonacciIterImpl implements Fibonacci {
    @Override
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int bigger = 1;
        int smaller = 0;
        int tmp;
        for (int i = 1; i < n; i++) {
            tmp = bigger + smaller;
            smaller = bigger;
            bigger = tmp;
        }
        return bigger;
    }
}
