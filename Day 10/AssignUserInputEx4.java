package com.celcom.day10;

import java.util.*;

public class AssignUserInputEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter size of the arrays: ");
		int size = scanner.nextInt();

		Integer[] arr1 = new Integer[size];
		Integer[] arr2 = new Integer[size];

		System.out.println("Enter elements for first array: ");
		for (int i = 0; i < size; i++) {
			arr1[i] = scanner.nextInt();
		}

		System.out.println("Enter elements for second array: ");
		for (int i = 0; i < size; i++) {
			arr2[i] = scanner.nextInt();
		}

		List<Integer> list1 = Arrays.asList(arr1);
		List<Integer> list2 = Arrays.asList(arr2);

		Collections.sort(list1);
		Collections.sort(list2);

		boolean areEqual = list1.equals(list2);
		System.out.println("Arrays contain the same elements: " + areEqual);

		scanner.close();
	}
}
