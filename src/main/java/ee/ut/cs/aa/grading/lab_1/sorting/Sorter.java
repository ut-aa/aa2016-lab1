package ee.ut.cs.aa.grading.lab_1.sorting;

import java.util.List;

/**
 * Purpose: Provides a method for list sorting.
 * 
 * Task: Implement one sorting algorithm with Theta(n**2) worst-case complexity (e.g. insertion sort,
 * selection sort, bubble sort) and one sorting algorithm with Theta(n*log n) worst-case complexity
 * (e.g. quick sort, merge sort, Shell sort). Note: these complexities must only be obtained with
 * lists that provide constant time access.  
 * 
 * @author Janno Siim
 * @param <T> Object type that list contains.
 */
public interface Sorter<T extends Comparable<T>> {
	
	/**
	 * Sorts list in nondecreasing order. If list provides constant time
	 * access by index then best implementations have worst-case Theta(n*log n) complexity.
	 * @param list
	 */
	void sort(List<T> list);
}
