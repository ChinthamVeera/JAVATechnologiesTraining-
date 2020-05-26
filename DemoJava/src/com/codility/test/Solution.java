package com.codility.test;

public class Solution {
	public int solution(int[] array) {

		int candidate = 0;
		int counter = 0;

		// Find candidate for leader
		for (int i = 0; i < array.length; i++) {

			if (counter == 0)
				candidate = i;

			if (array[i] == array[candidate]) {
				counter++;
			} else {
				counter--;
			}
		}

		// Count candidate occurrences in array
		counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == array[candidate])
				counter++;
			
		}
	   
		// Check that candidate occurs more than array.lenght/2
		return counter > array.length / 2 ? candidate : -1;
	}

	public static void main(String[] args) {
		Solution solution2 = new Solution();

		int[] A = { 3, 67, 23, 67, 67};
		solution2.solution(A);

	}

}
