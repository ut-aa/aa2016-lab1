package ee.ut.cs.aa.grading.lab_1.sorting;

import java.util.List;

/**
 * Interface for a generic sorter.
 * 
 * @param <T> Object type of the elements in the data structure.
 */
public interface Sorter<T extends Comparable<T>> {
	
	/**
	 * Reorder elements of the list into a non-decreasing order. 
	 * Note that the original list must be mutated.
	 * 
	 * @param list
	 */
	void sort(List<T> list);
}
