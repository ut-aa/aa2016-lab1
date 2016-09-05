package ee.ut.cs.aa.grading.lab_1.fibonacci;

/**
 * Interface for a calculator of numbers from the @see <a href="https://en.wikipedia.org/wiki/Fibonacci_number">Fibonacci sequence</a>.
 */
public interface Fibonacci {

    /**
     * Find the n-th number of the Fibonacci sequence (0, 1, 1, 2, ...).
     *
     * Indexing is 0-based.
     *
     * @param n index of the Fibonacci number to be calculated
     * @return n-th Fibonacci number
     */
    int fibonacci(int n);
}
