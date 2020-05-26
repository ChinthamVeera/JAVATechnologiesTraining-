package com.codility.test;

public class TestDemo {

	public int[] solution(int[] A, int K) {

		int[] B = new int[A.length];

		for (int l = 0; K > l; K--) {
			int j = 0;
			for (int i = 0; i < A.length; i++) {
				if (i == 0) {
					B[j] = A[A.length - 1];
					j++;
				} else {
					B[j] = A[i - 1];
					j++;
				}
			}
			for (int i = 0; i < A.length; i++) {
				A[i] = B[i];
				System.out.println(B[i]);
			}
		}

		return B;
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		TestDemo rotate = new TestDemo();
		int arr[] = { 3, 8, 9, 7, 6 };
		// rotate.leftRotate(arr, 2, 3);
		rotate.solution(arr, 2);
	}
}