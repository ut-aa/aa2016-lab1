package ee.ut.cs.aa.grading.lab_1.fibonacci;

/**
 * Interface for calculating  @see <a href="https://en.wikipedia.org/wiki/Fibonacci_number">Fibonacci sequence</a>.
 *
 */
public interface Fibonacci {


    /**
     *
     * Calculates numbers from the Fibonacci sequence.
     *
     * The sequence begins with 0,1,1,2,...
     *
     * Indexing is 0 based.
     *
     * @param n index of the number from the Fibonacci sequence to be calculated
     * @return the n-th Fibonacci number
     */
    int fibonacci(int n);
}
