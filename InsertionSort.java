/*
 * Pseudocode:							cost		times
 * for j = 2 to A.length					c1		n
 * 	key = A[j]						c2		n - 1
 * 	// Insert A[j] into the sorted
 * 		sequence A[1..j - 1]				0
 * 	i = j - 1						c4		n - 1
 * 	while i > 0 and A[i] > key				c5		sum:from j = 2 to n:(tj)
 * 		A[i + 1] = A[i]					c6		sum:from j = 2 to n:(tj - 1)
 * 		i = i - 1					c7		sum:from j = 2 to n:(tj - 1)
 * 	A[i + 1] = key						c8		n - 1
 * 
 * Input size: n (dependant on list size)
 * Running time: 
 * 	T(n) = c1*n + c2*(n - 1) + c4*(n - 1) + c5*sum:from j = 2 to n:(tj)
 * 		   + c6*sum:from j = 2 to n:(tj - 1) + c7*sum:from j = 2 to n:(tj - 1)
 * 		   + c8*(n - 1)
 * 		 In the best case scenario the list would be sorted in order,
 * 		 making tj = 1
 * 		 = c1*n + c2*(n - 1) + c4*(n - 1) + c5*(n - 1) + c8*(n - 1)
 * 		 = (c1 + c2 + c3 + c4 + c5 + c8)*n - (c2 + c4 + c5 + c8)
 * 		 At this point running time has been expressed in the form of
 * 		 an + b, in other words as a linear function.
 * 		 Thus, for the best case scenario running time is O(n).
 * 
 * 		 In the worst case scenario the list would be sorted in reverse order,
 * 		 making tj = j:
 *		 sum:from j = 2 to n:(j) = (n*(n + 1) / 2) + 1 
 *		 sum:from j = 2 to n:(j - 1) = n*(n - 1) / 2
 *		 Therefore, T(n) becomes:
 *	T(n) = c1*n + c2*(n - 1) + c4*(n - 1) + c5*((n*(n + 1) / 2) - 1)
 *		   + c6*(n*(n - 1) / 2) + c7*(n*(n - 1) / 2) + c8*(n - 1)
 *		 = (c5/2 + c6/2 + c7/2)*n^2 + (c1 + c2 + c4 + c5/2 + c6/2 + c7/2 + c8)*n
 *		   - (c2 + c4 + c5 + c8)
 *		 Which is of the form a*n^2 + b*n + c, a quadratic function of n.
 *		 Thus, for the worst case scenario running time is O(n^2).
 */
package com.algorithms.sorting;

/**
 * This class implements the Insertion Sort algorithm as seen on 
 * Introduction to Algorithms by Thomas H. Cormen, Charles E. Leiserson,
 * Ronald L. Rivest, Clifford Stein.
 * @author Thomas H. Cormen
 * @author Charles E. Leiserson
 * @author Ronald L. Rivest
 * @author Clifford Stein
 * 
 * @since 1.7
 */

public class InsertionSort {
	
	/* Prevent instantiation */
	private InsertionSort() {}
	
	/**
	 * Sorts the specified array of integers in ascending order.
	 * @param a the array to be sorted
	 */
	public static void insertionSort(int[] a) {
		for(int j = 0; j < a.length; j++) {
			int key = a[j];
			int i = j - 1;
			while(i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
	}
	
	/**
	 * Sorts the specified array of shorts in ascending order.
	 * @param a the array to be sorted
	 */
	public static void insertionSort(short[] a) {
		for(int j = 0; j < a.length; j++) {
			short key = a[j];
			int i = j - 1;
			while(i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
	}

	/**
	 * Sorts the specified array of longs in ascending order.
	 * @param a the array to be sorted
	 */
	public static void insertionSort(long[] a) {
		for(int j = 0; j < a.length; j++) {
			long key = a[j];
			int i = j - 1;
			while(i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
	}

	/**
	 * Sorts the specified array of characters in ascending order.
	 * @param a the array to be sorted
	 */
	public static void insertionSort(char[] a) {
		for(int j = 0; j < a.length; j++) {
			char key = a[j];
			int i = j - 1;
			while(i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
	}

	/**
	 * Sorts the specified array of bytes in ascending order.
	 * @param a the array to be sorted
	 */
	public static void insertionSort(byte[] a) {
		for(int j = 0; j < a.length; j++) {
			byte key = a[j];
			int i = j - 1;
			while(i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
	}

	/**
	 * Sorts the specified array of floats in ascending order.
	 * @param a the array to be sorted
	 */
	public static void insertionSort(float[] a) {
		for(int j = 0; j < a.length; j++) {
			float key = a[j];
			int i = j - 1;
			while(i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
	}

	/**
	 * Sorts the specified array of doubles in ascending order.
	 * @param a the array to be sorted
	 */
	public static void insertionSort(double[] a) {
		for(int j = 0; j < a.length; j++) {
			double key = a[j];
			int i = j - 1;
			while(i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
	}

	/**
	 * Sorts the specified array of Objects in ascending order, according to the java.util.Comparator interface.
	 * @param a the array to be sorted
	 */
	public static <T extends Comparable<? super T>> void insertionSort(T[] A) {
		for(int j = 0; j < A.length; j++) {
			T key = A[j];
			int i = j - 1;
			while(i >= 0 && A[i].compareTo(key) <= 0) {
				A[i + 1] = A[i];
				i--;
			}
			A[i + 1] = key;
		}
	}

	public static void main(String args[]) {
		int[] b = {5, 2, 4, 6, 1, 3};
		String[] c = { "john", "alice", "bob", "ronald"};
		char[] ch = {'a', 'g', 'j', 'r', 'o', 'l' };
		
		insertionSort(b);
		insertionSort(c);
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("");

		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println("");

		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
	}
}
