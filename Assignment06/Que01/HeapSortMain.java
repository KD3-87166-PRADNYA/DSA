package com.sunbeam;

import java.util.Arrays;

public class HeapSortMain {

	public static void main(String[] args) {
		
		int arr[] = {0, 6, 14, 3};
		
		Heap h = new Heap();
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		h.heapSort(arr);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
