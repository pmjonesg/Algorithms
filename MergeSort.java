/*
 * Pseudocode:
 * MERGE(A, p, q, r)
 * n1 = q - p + 1
 * n2 = r - q
 * let L[1..n1 + 1] and R[1..n2 + 1] be new arrays
 * for i = 1 to n1
 * 	L[i] = A[p + i - 1]
 * for j = 1 to n2
 * 	R[j] = A[q + j]
 * L[n1 + 1] = infinity
 * R[n2 + 1] = infinity
 * i = 1
 * j = 1
 * for k = p to r
 * 	if L[i] <= R[j]
 * 		A[k] = L[i]
 * 		i = i + 1
 * 	else A[k] = R[j]
 * 		j = j + 1
 * 
 * MERGE-SORT(A, p, r)
 * if p < r
 * 	q = [(p + r)/2]
 * 	MERGE-SORT(A, p q)
 * 	MERGE-SORT(A, q + 1, r)
 * 	MERGE(A, p, q, r)
 *  
 * Input size: n (dependant on list size)
 * Running time:
 *	As all variable initializations take a constant time, and the for loops
 *	used to fill the L and R arrays take O(n1 + n2) = O(n) time for the merge
 *  procedure.
 *  
 *  	
 */

package com.algorithms.sorting;

/**
 * This is the Merge Sort algorithm based on the pseudocode in Introduction to Algorithms
 * by Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein.
 * 
 * Merge Sort uses the divide and conquer strategy which consists of dividing
 * the problem into a number of subproblems which are smaller instances of the
 * same problem, conquering that problem recursively or in a straightforward
 * manner if possible, and combining the solutions of the subproblems to obtain
 * the solution to the whole problem.
 * 
 * This implementation uses a sentinel card (represented by infinity) which 
 * simplifies the code as it is used as an element with a maximum value(to avoid
 * checking for an empty sublist).
 * 
 * @author Peter Jones
 */

public class MergeSort {

	/**
	 * Prevent initialization
	 */
	private MergeSort() { }
	
	
}
