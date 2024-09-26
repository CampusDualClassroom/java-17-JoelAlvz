package com.campusdual.classroom;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
		 int array1[] = new int[positions];
		 return array1;
    }

	public static String[] createInitializedStringArray() {
		String array2[] = {"1","2","3"};
		return array2;
	}

	public static void populateArray(int[] array, int index, int value) {
		array[index] = value;
	}

	public static int arrayLength(int[] array) {
		return array.length;
	}

	public static void showValue(int[] array, int index) {
		System.out.println(array[index]);
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
